package com.knowledge.delivering.skipforward;

import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.knowledge.delivering.skipforward.adapters.BleServicesAdapter;
import com.knowledge.delivering.skipforward.demo.DemoHeartRateSensorActivity;
import com.knowledge.delivering.skipforward.demo.DemoSensorActivity;
import com.knowledge.delivering.skipforward.sensor.BleHeartRateSensor;
import com.knowledge.delivering.skipforward.sensor.BleSensor;
import com.knowledge.delivering.skipforward.sensor.BleSensors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainActivityHR extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text1;
    TextView stopwatch;
    private TextView countUp;
    private MediaPlayer mediaPlayer;

    private ListView ctItems;

    private CheckBox musicBox;

    private List<Product> lstProducts;
    public static List<Integer> lstTimers;
    public static List<String> lstCtTimers;

    ArrayAdapter listCtAdapter;

    ProgressBar mProgressBar;

    public static final String FORMAT = "%02d:%02d:%02d";
    int seconds, minutes;
    int i=0;
    int x = 0;
    int timerCount =1 ;
    int round = 1;
    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;
    int Seconds, Minutes, MilliSeconds ;
    boolean play = false;

    Handler handler;

    String[] choosenWorkout = {"","Jump 1", "Jump 600", "Jump K30"};

//BLE ACTIVITY
private final static String TAG = DeviceServicesActivity.class.getSimpleName();

    public static final String EXTRAS_DEVICE_NAME = "DEVICE_NAME";
    public static final String EXTRAS_DEVICE_ADDRESS = "DEVICE_ADDRESS";

    private TextView heartRateField2;
    private TextView connectionState;

    private ExpandableListView gattServicesList;
    private BleServicesAdapter gattServiceAdapter;

    private String deviceName;
    private String deviceAddress;
    private BleService bleService;
    private boolean isConnected = false;

    private BleSensor<?> activeSensor;
    private BleSensor<?> heartRateSensor;

    private BleServicesAdapter.OnServiceItemClickListener serviceListener;

    // Code to manage Service lifecycle.
    private final ServiceConnection serviceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            bleService = ((BleService.LocalBinder) service).getService();
            if (!bleService.initialize()) {
                Log.e(TAG, "Unable to initialize Bluetooth");
                finish();
            }
            // Automatically connects to the device upon successful start-up initialization.
            bleService.connect(deviceAddress);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            bleService = null;
        }
    };

    // Handles various events fired by the Service.
    // ACTION_GATT_CONNECTED: connected to a GATT server.
    // ACTION_GATT_DISCONNECTED: disconnected from a GATT server.
    // ACTION_GATT_SERVICES_DISCOVERED: discovered GATT services.
    // ACTION_DATA_AVAILABLE: received data from the device.  This can be a result of read
    //                        or notification operations.
    private final BroadcastReceiver gattUpdateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            if (BleService.ACTION_GATT_CONNECTED.equals(action)) {
                isConnected = true;
                updateConnectionState(R.string.connected);
                //invalidateOptionsMenu();
            } else if (BleService.ACTION_GATT_DISCONNECTED.equals(action)) {
                isConnected = false;
                updateConnectionState(R.string.disconnected);
               // invalidateOptionsMenu();
                clearUI();
            } else if (BleService.ACTION_GATT_SERVICES_DISCOVERED.equals(action)) {
                // Show all the supported services and characteristics on the user interface.
                displayGattServices(bleService.getSupportedGattServices());
                enableHeartRateSensor();
            } else if (BleService.ACTION_DATA_AVAILABLE.equals(action)) {
                displayData(intent.getStringExtra(BleService.EXTRA_SERVICE_UUID), intent.getStringExtra(BleService.EXTRA_TEXT));

            }
        }
    };

    // If a given GATT characteristic is selected, check for supported features.  This sample
    // demonstrates 'Read' and 'Notify' features.  See
    // http://d.android.com/reference/android/bluetooth/BluetoothGatt.html for the complete
    // list of supported characteristic features.
    private final ExpandableListView.OnChildClickListener servicesListClickListner =
            new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition,
                                            int childPosition, long id) {
                    if (gattServiceAdapter == null)
                        return false;

                    final BluetoothGattCharacteristic characteristic = gattServiceAdapter.getChild(groupPosition, childPosition);
                    final BleSensor<?> sensor = BleSensors.getSensor(characteristic.getService().getUuid().toString());

                    if (activeSensor != null)
                        bleService.enableSensor(activeSensor, false);

                    if (sensor == null) {
                        bleService.readCharacteristic(characteristic);
                        return true;
                    }

                    if (sensor == activeSensor)
                        return true;

                    activeSensor = sensor;
                    bleService.enableSensor(sensor, true);
                    return true;
                }
            };

    private final BleServicesAdapter.OnServiceItemClickListener demoClickListener = new BleServicesAdapter.OnServiceItemClickListener() {
        @Override
        public void onDemoClick(BluetoothGattService service) {
            Log.d(TAG, "onDemoClick: service" +service.getUuid().toString());
            final BleSensor<?> sensor = BleSensors.getSensor(service.getUuid().toString());
            if (sensor == null)
                return;

            final Class<? extends DemoSensorActivity> demoClass;
            if (sensor instanceof BleHeartRateSensor)
                demoClass = DemoHeartRateSensorActivity.class;
            else
                return;

            final Intent demoIntent = new Intent();
            demoIntent.setClass(MainActivityHR.this, demoClass);
            demoIntent.putExtra(DemoSensorActivity.EXTRAS_DEVICE_ADDRESS, deviceAddress);
            demoIntent.putExtra(DemoSensorActivity.EXTRAS_SENSOR_UUID, service.getUuid().toString());
            startActivity(demoIntent);
        }

        @Override
        public void onServiceEnabled(BluetoothGattService service, boolean enabled) {
            if (gattServiceAdapter == null)
                return;

            final BleSensor<?> sensor = BleSensors.getSensor(service.getUuid().toString());
            if (sensor == null)
                return;

            if (sensor == activeSensor)
                return;

            if (activeSensor != null)
                bleService.enableSensor(activeSensor, false);
            activeSensor = sensor;
            bleService.enableSensor(sensor, true);
        }

        @Override
        public void onServiceUpdated(BluetoothGattService service) {
            final BleSensor<?> sensor = BleSensors.getSensor(service.getUuid().toString());
            if (sensor == null)
                return;

            bleService.updateSensor(sensor);
        }
    };

    private void clearUI() {
        gattServicesList.setAdapter((SimpleExpandableListAdapter) null);
       // dataField.setText(R.string.no_data);
        heartRateField2.setText(R.string.no_data);
       // intervalField.setText(R.string.no_data);
    }

    public void setServiceListener(BleServicesAdapter.OnServiceItemClickListener listener) {
        this.serviceListener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button go = (Button) findViewById(R.id.button);
        final Button set = (Button) findViewById(R.id.button3);
       //    go.setEnabled(false);
       // set.setEnabled(false);


        text1 = (TextView) findViewById(R.id.textView1);
        stopwatch = (TextView)findViewById(R.id.stopwatch);
        countUp = (TextView)findViewById(R.id.counter);
        heartRateField2 =(TextView)findViewById(R.id.heartrate_value2);
        handler = new Handler() ;

        ctItems = (ListView) findViewById(R.id.ctItems);

        //get the spinner from the xml.
         Spinner dropdown = (Spinner)findViewById(R.id.spinner1);

        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, choosenWorkout);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

        lstProducts = new ArrayList<>();
       // lstTimers = new ArrayList<>();
        //lstCtTimers = new ArrayList<>();

        mProgressBar=(ProgressBar)findViewById(R.id.progressBar);
        mProgressBar.setProgress(i);

        dropdown.setOnItemSelectedListener(MainActivityHR.this);


        final Intent gattServiceIntent = new Intent(this, BleService.class);
        bindService(gattServiceIntent, serviceConnection, BIND_AUTO_CREATE);

        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                countUp.setText(String.valueOf(round));
                //ctItems.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

                if (x != 1) {

                    startCountDown(lstTimers.get(0) * 1000);
                    ctItems.setItemChecked(0,true);

                    x++;
                }

                StartTime = SystemClock.uptimeMillis();
                handler.postDelayed(runnable,0);

                        hideSoftKeyboard(MainActivityHR.this, v); // MainActivity is the name of the class and v is the View parameter used in the button listener method onClick.

            }

        });



        set.setOnClickListener(new View.OnClickListener() {


            int click = 1;
            public void onClick(View v) {
               // go.setEnabled(true);

                EditText t = (EditText) findViewById(R.id.editText);
                int y1 = Integer.valueOf(t.getText().toString());
                String clicked = String.valueOf(click);

                lstProducts.add(new Product(clicked, System.currentTimeMillis()+ y1 *1000 ));

                int seconds1 = (int) (y1 *1000 / 1000) % 60;
                int minutes1 = (int) ((y1 *1000 / (1000 * 60)) % 60);
                int hours1 = (int) ((y1 * 1000 / (1000 * 60 * 60)) % 24);
                String CDTimer = new String ( minutes1 + " mins " + seconds1 + " sec");

                lstCtTimers.add(CDTimer);
                lstTimers.add(y1);
                click++;

               t.setText("");

                listCtAdapter = new ArrayAdapter<>(MainActivityHR.this, android.R.layout.simple_list_item_activated_1, lstCtTimers);


                ctItems.setAdapter(listCtAdapter);
            }

            });

    }


public void addListenerOnMusicBox(){
        musicBox = (CheckBox) findViewById(R.id.checkBox);
        musicBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //find out if checked
                if(musicBox.isChecked()){
                    play = true;
                }
                else
                    play= false;
            }
        });
}

    public static void hideSoftKeyboard (Activity activity, View view)
    {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }



    private class Product {
        String name;
        long expirationTime;

        public Product(String name, long expirationTime) {
            this.name = name;
            this.expirationTime = expirationTime;
        }
    }

    private class ViewHolder {
        TextView tvProduct;
        TextView tvTimeRemaining;
        Product mProduct;

        public void setData(Product item) {
            mProduct = item;
            tvProduct.setText(item.name);
            updateTimeRemaining(System.currentTimeMillis());
        }

        public void updateTimeRemaining(long currentTime) {
            long timeDiff = mProduct.expirationTime - currentTime;
            if (timeDiff > 0) {
                int seconds = (int) (timeDiff / 1000) % 60;
                int minutes = (int) ((timeDiff / (1000 * 60)) % 60);
                int hours = (int) ((timeDiff / (1000 * 60 * 60)) % 24);
                tvTimeRemaining.setText(hours + " hrs " + minutes + " mins " + seconds + " sec");
            } else {
                tvTimeRemaining.setText("Expired!!");

            }
        }
    }

        public void startCountDown(final long duration) {

            final CountDownTimer timer = new CountDownTimer(duration, 1000) { // adjust the milli seconds here

                @Override
                @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
                public void onTick(long millisUntilFinished) {


                    text1.setText("" + String.format(FORMAT,
                            TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                    TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));

                    long seconds = millisUntilFinished/1000;
                         addListenerOnMusicBox();
                    if (seconds==5){

                        try {
                            final ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100);
                            tg.startTone(ToneGenerator.TONE_PROP_BEEP2);
                           /* Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                            Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
                            r.play();*/
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    if (seconds==0){

                        try {
                            final ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100);
                            tg.startTone(ToneGenerator.TONE_PROP_BEEP);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    Log.v("Log_tag", "Tick of Progress"+ i+ millisUntilFinished);
                    i++;
                    mProgressBar.setProgress((int)seconds);
                }


                @Override
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                public void onFinish() {
                    round++;
                    countUp.setText(String.valueOf(round));
                    AudioManager mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                    long eventtime = SystemClock.uptimeMillis();

                    if (mAudioManager == null) mAudioManager = (AudioManager)getSystemService(AUDIO_SERVICE);


                    if (play == true) {
                        KeyEvent downEvent = new KeyEvent(eventtime, eventtime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_NEXT, 0);
                        mAudioManager.dispatchMediaKeyEvent(downEvent);

                        KeyEvent upEvent = new KeyEvent(eventtime, eventtime, KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MEDIA_NEXT, 0);
                        mAudioManager.dispatchMediaKeyEvent(upEvent);
                    }
                    int numTimers = lstTimers.size();

                    if (numTimers==1)
                        startCountDown(duration);
                    else if (timerCount < numTimers  ){
                        startCountDown( lstTimers.get(timerCount)*1000);
                        timerCount++;
                        ctItems.setItemChecked(timerCount -1,true);
                        ctItems.setSelection(timerCount-1);

                    }
                }
            };
            timer.start();

            final Button button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    timer.cancel();
                    x = 0;
                }
//start.start();
            });

        }

    public Runnable runnable = new Runnable() {

        public void run() {

            MillisecondTime = SystemClock.uptimeMillis() - StartTime;

            UpdateTime = TimeBuff + MillisecondTime;

            Seconds = (int) (UpdateTime / 1000);

            Minutes = Seconds / 60;

            Seconds = Seconds % 60;

            MilliSeconds = (int) (UpdateTime % 1000);

            stopwatch.setText("" + Minutes + ":"
                    + String.format("%02d", Seconds) + ":"
                    + String.format("%03d", MilliSeconds));

            handler.postDelayed(this, 0);
        }

    };



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "YOUR SELECTION IS : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

        Dialog settingsDialog = new Dialog(this);

        String selectedWorkOut = parent.getItemAtPosition(position).toString();

        Treadmill.workouts testing = new Treadmill().new workouts();
        Bicycle.workouts testingBikes = new Bicycle().new workouts();
        JumpRope.workouts testingJumpRope = new JumpRope().new workouts();
        TwentyOneDay.workouts testing21Day = new TwentyOneDay().new workouts();


        if(ModuleJump.selectedWorkout=="Jump 600"){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.jump600
                    , null));
            settingsDialog.show();
        }

        if(ModuleJump.selectedWorkout=="Jump K30"){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.jumpk30
                    , null));
            settingsDialog.show();
        }

        else if(ModuleRun.selectedWorkout=="21DayMWR"){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.mtr21day
                    , null));
            settingsDialog.show();
        }




        //listCtAdapter = new ArrayAdapter<>(MainActivityRun.this, android.R.layout.simple_list_item_activated_1, lstCtTimers);
        final ArrayAdapter<String> listCtAdapter = new ArrayAdapter<String>(MainActivityHR.this, android.R.layout.simple_list_item_activated_1, lstCtTimers) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);


                // Return the view
                return view;
            }

        };
        ctItems.setAdapter(listCtAdapter);
    }


    //ctItems.setAdapter(listCtAdapter);

    //  }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        lstCtTimers.add("Nothing");
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(gattUpdateReceiver, makeGattUpdateIntentFilter());
        if (bleService != null) {
            final boolean result = bleService.connect(deviceAddress);
            Log.d(TAG, "Connect request result=" + result);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(gattUpdateReceiver);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(serviceConnection);
        bleService = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gatt_services, menu);
        if (isConnected) {
            menu.findItem(R.id.menu_connect).setVisible(false);
            menu.findItem(R.id.menu_disconnect).setVisible(true);
        } else {
            menu.findItem(R.id.menu_connect).setVisible(true);
            menu.findItem(R.id.menu_disconnect).setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_connect:
                bleService.connect(deviceAddress);
                return true;
            case R.id.menu_disconnect:
                bleService.disconnect();
                return true;
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateConnectionState(final int resourceId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                connectionState.setText(resourceId);
            }
        });
    }

    private void displayData(String uuid, String data) {
        if (data != null) {
            if (uuid.equals(BleHeartRateSensor.getServiceUUIDString())) {
                heartRateField2.setText(data);
                //MainActivityRun.heartRateField2.setText(data);
                //heartRateField2.setText(data);
            } else {
                //dataField.setText(data);
            }
        }
    }

    private boolean enableHeartRateSensor() {
        if (gattServiceAdapter == null)
            return false;

        final BluetoothGattCharacteristic characteristic = gattServiceAdapter
                .getHeartRateCharacteristic();
        Log.d(TAG,"characteristic: " + characteristic);
        final BleSensor<?> sensor = BleSensors.getSensor(characteristic
                .getService()
                .getUuid()
                .toString());

        if (heartRateSensor != null)
            bleService.enableSensor(heartRateSensor, false);

        if (sensor == null) {
            bleService.readCharacteristic(characteristic);
            return true;
        }

        if (sensor == heartRateSensor)
            return true;

        heartRateSensor = sensor;
        bleService.enableSensor(sensor, true);

        this.setServiceListener(demoClickListener);

        return true;
    }

    private void displayGattServices(List<BluetoothGattService> gattServices) {
        if (gattServices == null)
            return;

        gattServiceAdapter = new BleServicesAdapter(this, gattServices);
        gattServiceAdapter.setServiceListener(demoClickListener);
        gattServicesList.setAdapter(gattServiceAdapter);
    }

    private static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BleService.ACTION_GATT_CONNECTED);
        intentFilter.addAction(BleService.ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(BleService.ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(BleService.ACTION_DATA_AVAILABLE);
        return intentFilter;
    }



    }





