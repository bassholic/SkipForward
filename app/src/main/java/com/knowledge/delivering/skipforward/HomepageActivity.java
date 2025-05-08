package com.knowledge.delivering.skipforward;

import android.app.Activity;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.knowledge.delivering.skipforward.adapters.BleDevicesAdapter;

import static android.content.ContentValues.TAG;
/**
 * Created by v633015 on 3/26/2018.
 */

public class HomepageActivity extends Activity {

    ImageButton imageButtonBike;
    ImageButton imageButtonRun;
    ImageButton imageButtonJump;
    ImageButton imageButtonCustom;
    ImageButton imageButtonAbs;
    ImageButton imageButtonBattle;
    ImageButton imageButtonEliptical;
    ImageButton imageButtonDead;
    Button btScan;
    private TextView quote;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepageslideup);

       // imgview = (ImageView)findViewById(R.id.bikeImage);
        imageButtonBike = (ImageButton)  findViewById(R.id.bikeButton);
        imageButtonRun = (ImageButton)  findViewById(R.id.runButton);
        imageButtonJump = (ImageButton)  findViewById(R.id.jumpButton);
        imageButtonCustom = (ImageButton)  findViewById(R.id.customButton);
        imageButtonAbs = (ImageButton)  findViewById(R.id.abButton);
        imageButtonBattle = (ImageButton)  findViewById(R.id.battleButton);
        imageButtonEliptical = (ImageButton)  findViewById(R.id.elipButton);
        imageButtonDead = (ImageButton)  findViewById(R.id.deadButton);
        btScan = (Button)  findViewById(R.id.btScan);


        //Listening to button event

        imageButtonBike.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleBike.class);

                startActivity(nextScreen);

            }
        });

        imageButtonRun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleRun.class);

                startActivity(nextScreen);

            }
        });

        imageButtonJump.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleJump.class);

                startActivity(nextScreen);

            }
        });
     /*   imageButtonAbs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleAbs.class);

                startActivity(nextScreen);

            }
        });*/

        imageButtonCustom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCustom.class);

                startActivity(nextScreen);

            }
        });

        imageButtonBattle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleBattle.class);

                startActivity(nextScreen);

            }
        });

        imageButtonEliptical.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleEliptical.class);

                startActivity(nextScreen);

            }
        });

        imageButtonDead.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleDead.class);

                startActivity(nextScreen);

            }
        });


        btScan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), DeviceScanActivity.class);

                startActivity(nextScreen);

            }
        });

        Resources res = getResources();
        String[] inspiration =res.getStringArray(R.array.inspire_list);
        final String[] quoteList = {
                "Be brave enough to live life creatively. The creative place where no one else has ever been.\n" +
                        "Alan Alda" ,
                "Don't judge each day by the harvest you reap but by the seeds that you plant.\n" +
                        "Robert Louis Stevenson"};

        quote = (TextView)findViewById(R.id.quote);
       // int rando = (int)((Math.random() * quoteList.length));

        int rando = (int)((Math.random() * inspiration.length));
       // quote.setText(quoteList[rando]);
        quote.setText(inspiration[rando]);
        quote.setTextColor(Color.GREEN);

    }

}
