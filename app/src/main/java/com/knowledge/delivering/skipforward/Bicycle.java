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

public class Bicycle extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    MainActivityCycleHR MA = new MainActivityCycleHR();

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

            if (entry.toString().equalsIgnoreCase("Bike 1")) {

                lstCtTimers.add("2 min     warmup");
                lstTimers.add(2*60);
                lstCtTimers.add("20 sec     all-out SPRINT");
                lstTimers.add(20);
                lstCtTimers.add("2 min     recovery");
                lstTimers.add(2*60);
                lstCtTimers.add("20 sec     all-out SPRINT");
                lstTimers.add(20);
                lstCtTimers.add("2 min     recovery");
                lstTimers.add(2*60);
                lstCtTimers.add("20 sec     all-out SPRINT");
                lstTimers.add(20);
                lstCtTimers.add("3 min     cool down");
                lstTimers.add(3*60);
            }

            if (entry.toString().equalsIgnoreCase("Bike 1.1")) {

                lstCtTimers.add("5 min     level 1/8      steady pace");
                lstTimers.add(5*60);
                lstCtTimers.add("1 min     level 3/8      high intensity");
                lstTimers.add(1*60);
                lstCtTimers.add("2 min     level 1/8      steady pace");
                lstTimers.add(2*60);
                lstCtTimers.add("2 min     level 2/8      steady pace");
                lstTimers.add(2*60);
                lstCtTimers.add("1 min     level 3/8      high intensity");
                lstTimers.add(1*60);
                lstCtTimers.add("4 min     level 2/8      steady pace");
                lstTimers.add(4*60);
                lstCtTimers.add("1 min     level 3/8      high intensity");
                lstTimers.add(1*60);
                lstCtTimers.add("3 min     level 2/8      steady pace");
                lstTimers.add(3*60);
                lstCtTimers.add("1 min     level 3/8      ALL OUT!!");
                lstTimers.add(1*60);
            }

            if (entry.toString().equalsIgnoreCase("Bike 2.1")) {

                lstCtTimers.add("5 min     RPE 4-5");
                lstTimers.add(5*60);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("1 min     RPE 3-5");
                lstTimers.add(60 *1 );
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("1 min     RPE 3-5");
                lstTimers.add(60);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("1 min     RPE 3-5");
                lstTimers.add(60);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("20 sec     RPE 8-10");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 0");
                lstTimers.add(10);
                lstCtTimers.add("1 min     RPE 3-5");
                lstTimers.add(60);
                lstCtTimers.add("5 min     RPE 4-5");
                lstTimers.add(5 * 60);
            }

            if (entry.toString().equalsIgnoreCase("Bike 2.2")) {

                lstCtTimers.add("5 min     Warm-Up");
                lstTimers.add(5 * 60);
                lstCtTimers.add("30 sec    Hard");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Hard");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Hard");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Hard");
                lstTimers.add(30);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("1 min     Easy");
                lstTimers.add(60);
                lstCtTimers.add("1 min     Hard");
                lstTimers.add(60);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("1 min     Hard");
                lstTimers.add(60);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("1 min     Hard");
                lstTimers.add(60);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("1 min     Hard");
                lstTimers.add(60);
                lstCtTimers.add("30 sec    Moderate");
                lstTimers.add(30);
                lstCtTimers.add("1 min     Easy");
                lstTimers.add(60);
                lstCtTimers.add("45 sec    All-Out");
                lstTimers.add(45);
                lstCtTimers.add("15 sec     Easy");
                lstTimers.add(15);
                lstCtTimers.add("45 sec    All-Out");
                lstTimers.add(45);
                lstCtTimers.add("15 sec     Easy");
                lstTimers.add(15);
                lstCtTimers.add("45 sec    All-Out");
                lstTimers.add(45);
                lstCtTimers.add("15 sec     Easy");
                lstTimers.add(15);
                lstCtTimers.add("2 min    Easy");
                lstTimers.add(2*60);
                lstCtTimers.add("5 min    COOL-DOWN");
                lstTimers.add(5*60);

            }

            if (entry.toString().equalsIgnoreCase("Bike 2.3")) {

                lstCtTimers.add("7 min     RPE 3-4");
                lstTimers.add(7 * 60);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("2 min     RPE 3-4");
                lstTimers.add(2*60);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("30 sec     RPE 5-6");
                lstTimers.add(30);
                lstCtTimers.add("20 sec     RPE 7-8");
                lstTimers.add(20);
                lstCtTimers.add("10 sec     RPE 9-10");
                lstTimers.add(10);
                lstCtTimers.add("2 min     RPE 3-4");
                lstTimers.add(2*60);
                lstCtTimers.add("4 min Cool-Dowm  RPE 3-4");
                lstTimers.add(4*60);
            }

            if (entry.toString().equalsIgnoreCase("Bike 5")) {
                lstCtTimers.add("3 min     level 1/8      warm up");
                lstTimers.add(3 * 60);
                lstCtTimers.add("1 min     level 2/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 2/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 3/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 5/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 6/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 7/8      sprint");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      recovery");
                lstTimers.add(1 * 60);
                lstCtTimers.add("1 min     level 4/8      sprint");
                lstTimers.add(1 * 60);
            }


            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
