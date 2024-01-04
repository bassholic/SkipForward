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

public class ModuleEliptical extends AppCompatActivity {

    ImageButton imageButtonBike1;
    Button elip1;
    Button elip2;
    Button elip3;
    Button elip4;
    Button elip5;
    Button elip6;
    Button elip7;
    Button elip8;
    Button elip9;

    public static String selectedWorkout = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_eliptical);

        elip1 = (Button) findViewById(R.id.elip1);
        elip1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical1";
                testingElipticalRope.droppedDown("Eliptical1");

                startActivity(nextScreen);

            }
        });

        elip2 = (Button) findViewById(R.id.elip2);
        elip2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical2";
                testingElipticalRope.droppedDown("Eliptical2");

                startActivity(nextScreen);

            }
        });

        elip3 = (Button) findViewById(R.id.elip3);
        elip3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical3";
                testingElipticalRope.droppedDown("Eliptical3");

                startActivity(nextScreen);

            }
        });

        elip4 = (Button) findViewById(R.id.elip4);
        elip4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical4";
                testingElipticalRope.droppedDown("Eliptical4");

                startActivity(nextScreen);

            }
        });

        elip5 = (Button) findViewById(R.id.elip5);
        elip5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical5";
                testingElipticalRope.droppedDown("Eliptical5");

                startActivity(nextScreen);

            }
        });

        elip6 = (Button) findViewById(R.id.elip6);
        elip6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical6";
                testingElipticalRope.droppedDown("Eliptical6");

                startActivity(nextScreen);

            }
        });

        elip7 = (Button) findViewById(R.id.elip7);
        elip7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical7";
                testingElipticalRope.droppedDown("Eliptical7");

                startActivity(nextScreen);

            }
        });

        elip8 = (Button) findViewById(R.id.elip8);
        elip8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical8";
                testingElipticalRope.droppedDown("Eliptical8");

                startActivity(nextScreen);

            }
        });
        elip9 = (Button) findViewById(R.id.elip9);
        elip9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityEliptical.class);

                Eliptical.workouts testingElipticalRope = new Eliptical().new workouts();
                selectedWorkout = "Eliptical9";
                testingElipticalRope.droppedDown("Eliptical9");

                startActivity(nextScreen);

            }
        });

    }
}