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

public class Deadtread extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityDead MA = new MainActivityDead();

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

            if (entry.toString().equalsIgnoreCase("Dead1")) {

                lstCtTimers.add("1 min walk");
                lstTimers.add(60);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);
                lstCtTimers.add("15 sec sprint");
                lstTimers.add(15);
                lstCtTimers.add("45 sec walk/jog");
                lstTimers.add(45);



            }

            if (entry.toString().equalsIgnoreCase("Dead2")) {

                lstCtTimers.add("1 min walk");
                lstTimers.add(60);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("30 sec walk/jog");
                lstTimers.add(30);

            }

            if (entry.toString().equalsIgnoreCase("Dead3")) {

                lstCtTimers.add("1 min walk");
                lstTimers.add(60);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);
                lstCtTimers.add("20 sec sprint");
                lstTimers.add(20);
                lstCtTimers.add("20 sec walk/jog");
                lstTimers.add(20);


            }
            if (entry.toString().equalsIgnoreCase("Dead4")) {

                lstCtTimers.add("1 min Easy walk");
                lstTimers.add(60);
                lstCtTimers.add("1 min Brisk walk");
                lstTimers.add(60);
                lstCtTimers.add("1 min 60-75% ");
                lstTimers.add(60);
                lstCtTimers.add("1 min Sprint");
                lstTimers.add(60);
                lstCtTimers.add("1 min Rest");
                lstTimers.add(60);
                lstCtTimers.add("1 min Easy walk");
                lstTimers.add(60);
                lstCtTimers.add("1 min Brisk walk");
                lstTimers.add(60);
                lstCtTimers.add("1 min 60-75% ");
                lstTimers.add(60);
                lstCtTimers.add("1 min Sprint");
                lstTimers.add(60);
                lstCtTimers.add("1 min Rest");
                lstTimers.add(60);

            }


            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
