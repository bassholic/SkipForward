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

public class ModuleAbs extends AppCompatActivity {

    ImageButton imageButtonBike1;
    Button gravAb1;

    public static String selectedWorkout = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_abs);

        gravAb1 = (Button) findViewById(R.id.gravAbs1);
        gravAb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityAbsHR.class);

                Abs.workouts testingAbs = new Abs().new workouts();
                selectedWorkout = "GravAb1";
                testingAbs.droppedDown("GravAb1");

                startActivity(nextScreen);

            }
        });

    }
}