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

public class JumpRope extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityJump MA = new MainActivityJump();

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

            if (entry.toString().equalsIgnoreCase("Jump 1")) {

                lstCtTimers.add("60 sec      FORWARD JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      SIDE TO SIDE");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      BACKWARD JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      SINGLE LEG LEFT");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      SINGLE LEG RIGHT");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      FORWARD JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      ALTERNATING LEGS JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      X  FOOT-CROSS JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      SINGLE LEG LEFT");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      SINGLE LEG RIGHT");
                lstTimers.add(1*60);
                lstCtTimers.add("30 sec      DOUBLE JUMP");
                lstTimers.add(1*30);
                lstCtTimers.add("60 sec      BACKWARD JUMP");
                lstTimers.add(1*60);
                lstCtTimers.add("30 sec      DOUBLE JUMP");
                lstTimers.add(1*30);

            }

            if (entry.toString().equalsIgnoreCase("Jump 600")) {

                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      AIR SQUAT");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP RUNNING");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HIGH KNEES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      JUMPING LUNGES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP MUMMY KICKS");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HAND OVER HAND PUSH-UP");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      REST!!!");
                lstTimers.add(1 * 60);

                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      AIR SQUAT");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP RUNNING");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HIGH KNEES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      JUMPING LUNGES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP MUMMY KICKS");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HAND OVER HAND PUSH-UP");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      REST!!!");
                lstTimers.add(1 * 60);

                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      AIR SQUAT");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP RUNNING");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HIGH KNEES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      JUMPING LUNGES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP MUMMY KICKS");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HAND OVER HAND PUSH-UP");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      REST!!!");
                lstTimers.add(1 * 60);

                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      AIR SQUAT");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP RUNNING");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HIGH KNEES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP FREESTYLE");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      JUMPING LUNGES");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      JUMP MUMMY KICKS");
                lstTimers.add(1 * 60);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("30 sec      HAND OVER HAND PUSH-UP");
                lstTimers.add(1 * 30);
                lstCtTimers.add("10 sec      BREAAAAK");
                lstTimers.add(1 * 10);
                lstCtTimers.add("60 sec      REST!!!");
                lstTimers.add(1 * 60);



            }

            if (entry.toString().equalsIgnoreCase("Jump K30")) {

                lstCtTimers.add("60 sec      JUMP ROPE");
                lstTimers.add(1*60);
                lstCtTimers.add("60 sec      50 JUMPING JACKS");
                lstTimers.add(1*60);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("30 sec      20 ALTERNATING LUNGES");
                lstTimers.add(1*30);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("20 sec      15 JUMP TUCKS");
                lstTimers.add(1*20);
                lstCtTimers.add("30 sec      20 SQUATS");
                lstTimers.add(1*30);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("60 sec      HIGH KNEES");
                lstTimers.add(1*60);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("20 sec      15 JUMP SQUAT");
                lstTimers.add(1*20);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("45 sec      15 BURPEES");
                lstTimers.add(1*45);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("60 sec      50 JUMPING JACKS");
                lstTimers.add(1*60);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("20 sec      MTN CLIMBERS");
                lstTimers.add(1*20);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("40 sec      25 PUSH-UPS");
                lstTimers.add(1*40);
                lstCtTimers.add("30 sec      JUMP ROPE");
                lstTimers.add(1*30);
                lstCtTimers.add("60 sec      PLANK");
                lstTimers.add(1*60);

            }


            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
