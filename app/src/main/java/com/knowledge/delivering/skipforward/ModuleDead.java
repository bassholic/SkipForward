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

public class ModuleDead extends AppCompatActivity {

    ImageButton imageButtonBike1;
    Button dead15;
    Button dead20;
    Button dead20adv;
    Button deadSprintWalk;

    public static String selectedWorkout = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_dead);

        dead15 = (Button) findViewById(R.id.dead15);
        dead15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityDead.class);

                Deadtread.workouts testingDead = new Deadtread().new workouts();
                selectedWorkout = "Dead1";
                testingDead.droppedDown("Dead1");

                startActivity(nextScreen);

            }
        });

        dead20 = (Button) findViewById(R.id.dead20);
        dead20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityDead.class);

                Deadtread.workouts testingDead = new Deadtread().new workouts();
                selectedWorkout = "Dead2";
                testingDead.droppedDown("Dead2");

                startActivity(nextScreen);

            }
        });

        dead20adv = (Button) findViewById(R.id.dead20adv);
        dead20adv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityDead.class);

                Deadtread.workouts testingDead= new Deadtread().new workouts();
                selectedWorkout = "Dead3";
                testingDead.droppedDown("Dead3");

                startActivity(nextScreen);

            }
        });

        deadSprintWalk = (Button) findViewById(R.id.dead10min);
        deadSprintWalk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityDead.class);

                Deadtread.workouts testingDead= new Deadtread().new workouts();
                selectedWorkout = "Dead4";
                testingDead.droppedDown("Dead4");

                startActivity(nextScreen);

            }
        });


    }
}