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

public class BattleRope extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityBattle MA = new MainActivityBattle();

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

            if (entry.toString().equalsIgnoreCase("Beg 9")) {

                lstCtTimers.add("23 sec      Alternate Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      In & Out Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Seated Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Double Waves");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Counter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Clockwise");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Jumping Jacks");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Power Slams");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Side-2-Side Grass Cutter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Battle Rope Shuffle");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec     Ski Steps");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Alternate Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      In & Out Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Seated Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Double Waves");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Counter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Clockwise");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Jumping Jacks");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Power Slams");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Side-2-Side Grass Cutter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Battle Rope Shuffle");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec     Ski Steps");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Alternate Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      In & Out Wave");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Seated Hip Toss");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Double Waves");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Counter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Arm Circles Clockwise");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Jumping Jacks");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Power Slams");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Side-2-Side Grass Cutter");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      Battle Rope Shuffle");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec     Ski Steps");
                lstTimers.add(1*23);
                lstCtTimers.add("23 sec      REST");
                lstTimers.add(1*23);

            }

            if (entry.toString().equalsIgnoreCase("Intense 18")) {

                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("60 sec      REST");
                lstTimers.add(60);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("60 sec      REST");
                lstTimers.add(60);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("60 sec      REST");
                lstTimers.add(60);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      ALT WAVES");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      HIP TOSS");
                lstTimers.add(20);
                lstCtTimers.add("10 sec      REST");
                lstTimers.add(10);
                lstCtTimers.add("20 sec      JUMPING JACKS");
                lstTimers.add(20);
                lstCtTimers.add("60 sec      REST");
                lstTimers.add(60);
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
