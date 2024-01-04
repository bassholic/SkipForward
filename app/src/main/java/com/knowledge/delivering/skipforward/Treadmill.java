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

public class Treadmill extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityRunHR MA = new MainActivityRunHR();

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

            if (entry.toString().equalsIgnoreCase("Easy 1")) {

                lstCtTimers.add("3 min          1           3.5");
                lstTimers.add(180);
                lstCtTimers.add("30 sec        2           4.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        4           4.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        6           4.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        7           4.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        1           6.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        1           4.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        2           5.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        4           5.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        6           5.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        7           5.0");
                lstTimers.add(30);
                lstCtTimers.add("60 sec        1           3.5");
                lstTimers.add(60);
                lstCtTimers.add("60 sec        1           7.0");
                lstTimers.add(60);
                lstCtTimers.add("60 sec        1           3.5");
                lstTimers.add(60);
                lstCtTimers.add("30 sec        2           6.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        4           6.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        6           6.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec        7           6.0");
                lstTimers.add(30);
                lstCtTimers.add("2 min          1           3.5");
                lstTimers.add(120);
                lstCtTimers.add("60 sec        1           8.0");
                lstTimers.add(60);
                lstCtTimers.add("3 min          1           4.0");
                lstTimers.add(180);
                lstCtTimers.add("10 min        12          4.0");
                lstTimers.add(10 * 60);

            }

            if (entry.toString().equalsIgnoreCase("Easy 2")) {
                lstCtTimers.add("2 min        3           4.0");
                lstTimers.add(120);
                lstCtTimers.add("2 min        1           7.0");
                lstTimers.add(120);
                lstCtTimers.add("1.5 min     1           4.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.3");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           4.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.5");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           4.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.6");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           4.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.6");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           3.5");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.7");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           3.5");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.8");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min      1           3.5");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           8.9");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           3.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           9.0");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min     1           3.0");
                lstTimers.add(90);
                lstCtTimers.add("1 min        1           9.5");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min      1           3.0");
                lstTimers.add(90);
                lstCtTimers.add("45 sec       1           10.0");
                lstTimers.add(45);
                lstCtTimers.add("75 sec       3           2.0");
                lstTimers.add(75);
                lstCtTimers.add("5 min        1           7.0");
                lstTimers.add(5*60);
                lstCtTimers.add("2 min        3           3.0");
                lstTimers.add(120);
            }

            if (entry.toString().equalsIgnoreCase("Easy 3")) {
                lstCtTimers.add("4 min        8           4.0");
                lstTimers.add(60*4);
                lstCtTimers.add("1 min         1          4.0");
                lstTimers.add(60);
                lstCtTimers.add("30 sec       1           9.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("45 sec       1           9.0");
                lstTimers.add(45);
                lstCtTimers.add(".5 min       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("1 min        1           9.0");
                lstTimers.add(60);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("30 sec       1           8.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("1 min        1           8.0");
                lstTimers.add(60);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("45 sec       1           8.0");
                lstTimers.add(45);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("30 sec       1           8.0");
                lstTimers.add(30);
                lstCtTimers.add("30 sec       1           4.5");
                lstTimers.add(30);
                lstCtTimers.add("1.5 min      1           8.0");
                lstTimers.add(90);
                lstCtTimers.add("4 min         5           4.0");
                lstTimers.add(4*60);
                lstCtTimers.add("FINISHED 1.9 MILES");
            }

            if (entry.toString().equalsIgnoreCase("BB 20Sprint")) {
                lstCtTimers.add("5 min        1           3.0");
                lstTimers.add(60*5);
                lstCtTimers.add("2 min         1          4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1           7.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1           7.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1           7.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1           7.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min        1           3.0");
                lstTimers.add(60);

            }

            if (entry.toString().equalsIgnoreCase("BB 30Hill")) {
                lstCtTimers.add("5 min        2.0           3.0");
                lstTimers.add(60*5);
                lstCtTimers.add("5 min        3.5          3.5");
                lstTimers.add(60*5);
                lstCtTimers.add("1 min       5.0           4.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1.0           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       5.0           4.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1.0           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("3 min       5.0           5.0");
                lstTimers.add(60*3);
                lstCtTimers.add("1 min       7.0           5.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       5.0           5.0");
                lstTimers.add(60);
                lstCtTimers.add("2 min       1.0           4.5");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       5.0          5.0");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       7.0           5.0");
                lstTimers.add(60*1);
                lstCtTimers.add("4 min       1.0          3.0");
                lstTimers.add(60*4);
            }

            if (entry.toString().equalsIgnoreCase("BB 30Sprint")) {
                lstCtTimers.add("2 min        1.0           4.0");
                lstTimers.add(60*2);
                lstCtTimers.add("3 min        1.0          5.0");
                lstTimers.add(60*3);
                lstCtTimers.add("2 min       1.0           5.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1.0           6.0");
                lstTimers.add(60*1);
                lstCtTimers.add("3 min       1.0           5.0");
                lstTimers.add(60*3);
                lstCtTimers.add("2 min       1.0           5.5");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       1.0           6.0");
                lstTimers.add(60*1);
                lstCtTimers.add("2 min       1.0           4.0");
                lstTimers.add(60*2);
                lstCtTimers.add("3 min       1.0           5.5");
                lstTimers.add(60*3);
                lstCtTimers.add("2 min       1.0           6.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       1.0           6.5");
                lstTimers.add(60*2);
                lstCtTimers.add("6 min       1.0          6.2");
                lstTimers.add(60*6);
                lstCtTimers.add("1 min       1.0           4.0");
                lstTimers.add(60*1);
            }

            if (entry.toString().equalsIgnoreCase("BB 15Walker")) {
                lstCtTimers.add("4 min        1.0           3.0");
                lstTimers.add(60*4);
                lstCtTimers.add("1 min        4.0          3.5");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       5.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       6.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       7.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       8.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       5.0           3.5");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       5.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       6.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       7.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       8.0           4.0");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min       1.0          3.0");
                lstTimers.add(60*1);
            }

            if (entry.toString().equalsIgnoreCase("Speed 5k")) {
                lstCtTimers.add("1 min        4.0           2.0%");
                lstTimers.add(60*1);
                lstCtTimers.add("1 min        6.7          2.0");
                lstTimers.add(60*1);
                lstCtTimers.add("2 min       6.9           1.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.0           2.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.2           1.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.4           2.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.5           1.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.6           2.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.7           1.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       7.8           2.0");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       8.0           1");
                lstTimers.add(60*2);
                lstCtTimers.add("2 min       8.2          0");
                lstTimers.add(60*2);
                lstCtTimers.add("1 min       8.4          0");
                lstTimers.add(60*1);
                lstCtTimers.add("1:45 min       8.5          0");
                lstTimers.add(105);
            }
            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
