package com.knowledge.delivering.skipforward;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V633015 on 11/12/2017.
 */

public class Abs extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityAbsHR MA = new MainActivityAbsHR();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstTimers = new ArrayList<>();
        lstCtTimers = new ArrayList<>();
    }

    public  class workouts{

        public void droppedDown(String entry) {

            lstTimers = new ArrayList<>();
            lstCtTimers = new ArrayList<>();

           // Dialog settingsDialog = new Dialog(Treadmill.this);

            if (entry.toString().equalsIgnoreCase("GravAb1")) {

                lstCtTimers.add("60 sec      Navy Seal");
                lstTimers.add(60);
                lstCtTimers.add("45 sec      Leg Raise w/ Pulse Up");
                lstTimers.add(45);
                lstCtTimers.add("45 sec      Slide Hand Crunch");
                lstTimers.add(45);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("60 sec      V Situps");
                lstTimers.add(60);
                lstCtTimers.add("60 sec      Long Arm Crunches");
                lstTimers.add(60);
                lstCtTimers.add("60 sec      JackKnives");
                lstTimers.add(60);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("20 sec      Cobra 15/5");
                lstTimers.add(20);
                lstCtTimers.add("45 sec      Left Oblique V Situp");
                lstTimers.add(45);
                lstCtTimers.add("45 sec      Right Oblique V Situp");
                lstTimers.add(45);
                lstCtTimers.add("45 sec      Left Oblique Crunch");
                lstTimers.add(45);
                lstCtTimers.add("45 sec      Right Oblique V Crunch");
                lstTimers.add(45);
                lstCtTimers.add("60 sec      Alt Raised Heel Touches");
                lstTimers.add(60);

            }


            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
