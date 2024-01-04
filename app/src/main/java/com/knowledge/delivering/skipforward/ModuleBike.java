package com.knowledge.delivering.skipforward;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by v633015 on 3/27/2018.
 */

public class ModuleBike extends AppCompatActivity {

    ImageButton imageButtonBike1;
    ImageButton imageButtonBike2;
    ImageButton imageButtonBike3;
    ImageButton imageButtonBike4;
    ImageButton imageButtonBike5;
    ImageButton imageButtonBike6;
    Button button10min;
    Button button20min;
    Button button27min;
    Button button30min;
    Button button25red;
    Button button30red;

    public static String selectedWorkout= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bike_module);

        button10min = (Button) findViewById(R.id.button10min);
        button10min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 1";
                testingBikes.droppedDown("Bike 1");

                startActivity(nextScreen);

            }
        });

        button20min = (Button) findViewById(R.id.button20min);
        button20min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 1.1";
                testingBikes.droppedDown("Bike 1.1");

                startActivity(nextScreen);

            }
        });

        button27min = (Button) findViewById(R.id.button27min);
        button27min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 2.2";
                testingBikes.droppedDown("Bike 2.2");

                startActivity(nextScreen);

            }
        });

        button30min = (Button) findViewById(R.id.button30min);
        button30min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 2.1";
                testingBikes.droppedDown("Bike 2.1");

                startActivity(nextScreen);

            }
        });

        button25red = (Button) findViewById(R.id.button25redmin);
        button25red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 2.3";
                testingBikes.droppedDown("Bike 2.3");

                startActivity(nextScreen);

            }
        });

        button30red = (Button) findViewById(R.id.button30redmin);
        button30red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCycleHR.class);

                Bicycle.workouts testingBikes = new Bicycle().new workouts();

                selectedWorkout= "Bike 5";
                testingBikes.droppedDown("Bike 5");

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
