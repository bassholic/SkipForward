package com.knowledge.delivering.skipforward;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

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

    String[] choosenWorkout = {"","21DayMWR", "21DayF", "21DayS","Easy 1","Easy 2","Easy 3", "Bike 1","Bike 2.1", "Bike 2.2", "Bike 2.3", "Bike 5", "Jump 1", "Jump 600"};



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

        handler = new Handler() ;

        ctItems = (ListView) findViewById(R.id.ctItems);

        //get the spinner from the xml.
         Spinner dropdown = (Spinner)findViewById(R.id.spinner1);

        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, choosenWorkout);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

        lstProducts = new ArrayList<>();
        lstTimers = new ArrayList<>();
        lstCtTimers = new ArrayList<>();

        mProgressBar=(ProgressBar)findViewById(R.id.progressBar);
        mProgressBar.setProgress(i);

        dropdown.setOnItemSelectedListener(MainActivity.this);


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

                        hideSoftKeyboard(MainActivity.this, v); // MainActivity is the name of the class and v is the View parameter used in the button listener method onClick.

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

                listCtAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_activated_1, lstCtTimers);


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
        Eliptical.workouts testingEliptical = new Eliptical().new workouts();

        if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Easy 1")) {


            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.hiit_pop
                    , null));
            settingsDialog.show();
            lstCtTimers.clear();
            lstTimers.clear();
            testing.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Easy 2")) {
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.hiit_pop2
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testing.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Easy 3")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.hiit_pop3
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testing.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Bike 1")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.bike1
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingBikes.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Bike 2.1")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.bike2_1
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingBikes.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Bike 2.2")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.bike2_2
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingBikes.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Bike 2.3")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.bike2_3
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingBikes.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Bike 5")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.bike5
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingBikes.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Jump 1")){


            lstCtTimers.clear();
            lstTimers.clear();
            testingJumpRope.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Jump 600")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.jump600
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingJumpRope.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("21DayMWR")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.mtr21day
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testing21Day.droppedDown(selectedWorkOut);
        }
        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("21DayF")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.f21day
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testing21Day.droppedDown(selectedWorkOut);
        }
        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("21DayS")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.sat21day
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testing21Day.droppedDown(selectedWorkOut);
        }

        else if(parent.getItemAtPosition(position).toString().equalsIgnoreCase("Eliptical1")){
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.eliptical1
                    , null));
            settingsDialog.show();

            lstCtTimers.clear();
            lstTimers.clear();
            testingEliptical.droppedDown(selectedWorkOut);
        }

        listCtAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_activated_1, lstCtTimers);


        ctItems.setAdapter(listCtAdapter);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        lstCtTimers.add("Nothing");
    }



    }





