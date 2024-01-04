package com.knowledge.delivering.skipforward;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by v633015 on 3/27/2018.
 */

public class ModuleRun extends AppCompatActivity {


    Button mwr21;
    Button fri21;
    Button sat21;
    Button easy30;
    Button sprint37;
    Button speed5k;
    Button bb15walker;
    Button bb20sprint;
    Button bb30hill;
    Button bb30sprint;
    Button paced20HIIT;


    private RadioGroup radioGroup;
    private RadioButton w1, w2, w3;
    public static String whatWeek = "one";

    public static String selectedWorkout= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_run);

        radioGroup = (RadioGroup) findViewById(R.id.weekGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.week1) {
                    whatWeek="one";
                } else if(checkedId == R.id.week2) {
                    whatWeek="two";
                } else {
                    whatWeek="three";
                }
            }
        });

        w1 =(RadioButton) findViewById(R.id.week1);
        w2 =(RadioButton) findViewById(R.id.week2);
        w3 =(RadioButton) findViewById(R.id.week3);


        mwr21 = (Button) findViewById(R.id.mwr21);
        mwr21.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                TwentyOneDay.workouts testing21 = new TwentyOneDay().new workouts();

                selectedWorkout= "21DayMWR";
                testing21.droppedDown("21DayMWR");

                startActivity(nextScreen);

            }
        });

        fri21 = (Button) findViewById(R.id.fri21);
        fri21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                TwentyOneDay.workouts testing21 = new TwentyOneDay().new workouts();

                selectedWorkout= "21DayF";
                testing21.droppedDown("21DayF");

                startActivity(nextScreen);

            }
        });

        sat21 = (Button) findViewById(R.id.sat21);
        sat21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                TwentyOneDay.workouts testing21 = new TwentyOneDay().new workouts();

                selectedWorkout= "21DayS";
                testing21.droppedDown("21DayS");

                startActivity(nextScreen);

            }
        });

        easy30 = (Button) findViewById(R.id.easy30);
        easy30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);


                Treadmill.workouts testing = new Treadmill().new workouts();
                selectedWorkout= "Easy 1";
                testing.droppedDown("Easy 1");

                startActivity(nextScreen);

            }
        });

        sprint37 = (Button) findViewById(R.id.sprint37);
        sprint37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "Easy 2";
                testing.droppedDown("Easy 2");

                startActivity(nextScreen);

            }
        });

        speed5k = (Button) findViewById(R.id.speed5k);
        speed5k.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "Speed 5k";
                testing.droppedDown("Speed 5k");

                startActivity(nextScreen);

            }
        });

        paced20HIIT = (Button) findViewById(R.id.paced20HIIT);
        paced20HIIT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "Easy 3";
                testing.droppedDown("Easy 3");

                startActivity(nextScreen);

            }
        });

        bb15walker = (Button) findViewById(R.id.bb15walker);
        bb15walker.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "BB 15Walker";
                testing.droppedDown("BB 15Walker");

                startActivity(nextScreen);

            }
        });

        bb20sprint = (Button) findViewById(R.id.bb20sprint);
        bb20sprint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "BB 20Sprint";
                testing.droppedDown("BB 20Sprint");

                startActivity(nextScreen);

            }
        });

        bb30hill = (Button) findViewById(R.id.bb30hill);
        bb30hill.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "BB 30Hill";
                testing.droppedDown("BB 30Hill");

                startActivity(nextScreen);

            }
        });

        bb30sprint = (Button) findViewById(R.id.bb30sprint);
        bb30sprint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRunHR.class);

                Treadmill.workouts testing = new Treadmill().new workouts();

                selectedWorkout= "BB 30Sprint";
                testing.droppedDown("BB 30Sprint");

                startActivity(nextScreen);

            }
        });
      /*  imageButtonBike2 = (ImageButton)  findViewById(R.id.warmup2);
        imageButtonBike2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    //Starting a new Intent
                    Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycle.class);

                    Bicycle.workouts testingBikes = new Bicycle().new workouts();
                    selectedWorkout= "Bike 1.1";
                    testingBikes.droppedDown("Bike 1.1");

                    startActivity(nextScreen);

                }
        });

        imageButtonBike3 = (ImageButton)  findViewById(R.id.yhiit27);
        imageButtonBike3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycle.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();
                selectedWorkout= "";
                testingBikes.droppedDown("Bike 2.2");

                startActivity(nextScreen);

            }
        });

        imageButtonBike4 = (ImageButton)  findViewById(R.id.yhiit30);
        imageButtonBike4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycle.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();
                selectedWorkout= "";
                testingBikes.droppedDown("Bike 2.1");

                startActivity(nextScreen);

            }
        });

        imageButtonBike5 = (ImageButton)  findViewById(R.id.rhiit25);
        imageButtonBike5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycle.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();
                selectedWorkout= "";
                testingBikes.droppedDown("Bike 2.3");

                startActivity(nextScreen);

            }
        });
*/

    }





}
