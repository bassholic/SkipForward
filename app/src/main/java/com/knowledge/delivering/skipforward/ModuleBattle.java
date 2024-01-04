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

public class ModuleBattle extends AppCompatActivity {

    ImageButton imageButtonBike1;
    Button jump60;
    Button jump600cal;
    Button jumpk30;

    public static String selectedWorkout = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_battle);

        jump60 = (Button) findViewById(R.id.jump60);
        jump60.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityBattle.class);

                BattleRope.workouts testingBattleRope = new BattleRope().new workouts();
                selectedWorkout = "Beg 9";
                testingBattleRope.droppedDown("Beg 9");

                startActivity(nextScreen);

            }
        });

        jump600cal = (Button) findViewById(R.id.jump600cal);
        jump600cal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityBattle.class);

                BattleRope.workouts testingBattleRope = new BattleRope().new workouts();
                selectedWorkout = "Intense 18";
                testingBattleRope.droppedDown("Intense 18");

                startActivity(nextScreen);

            }
        });

        jumpk30 = (Button) findViewById(R.id.jumpk30);
        jumpk30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityBattle.class);

                JumpRope.workouts testingJumpRope = new JumpRope().new workouts();
                selectedWorkout = "Jump K30";
                testingJumpRope.droppedDown("Jump K30");

                startActivity(nextScreen);

            }
        });


    }
}