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

public class Eliptical extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityEliptical MA = new MainActivityEliptical();

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

            if (entry.toString().equalsIgnoreCase("Eliptical1")) {

                lstCtTimers.add("9%     6    Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     12   Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     12   Back");
                lstTimers.add(180);
                lstCtTimers.add("9%     13   Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     13   Back");
                lstTimers.add(180);
                lstCtTimers.add("9%     14   Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     14   Back");
                lstTimers.add(180);
                lstCtTimers.add("9%     15   Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     15   Back");
                lstTimers.add(180);
                lstCtTimers.add("6%     6    Forward");
                lstTimers.add(180);


            }

            if (entry.toString().equalsIgnoreCase("Eliptical2")) {

                lstCtTimers.add("7%     9    Forward");
                lstTimers.add(180);
                lstCtTimers.add("9%     12   Forward");
                lstTimers.add(180);
                lstCtTimers.add("12%    12   Forward");
                lstTimers.add(180);
                lstCtTimers.add("10%    13   Forward");
                lstTimers.add(180);
                lstCtTimers.add("13%    11   Forward");
                lstTimers.add(180);
                lstCtTimers.add("11%    14   Forward");
                lstTimers.add(180);
                lstCtTimers.add("14%    12   Forward");
                lstTimers.add(180);
                lstCtTimers.add("12%    15   Forward");
                lstTimers.add(180);
                lstCtTimers.add("15%    13   Forward");
                lstTimers.add(180);
                lstCtTimers.add("7%     9    Forward");
                lstTimers.add(180);

            }

            if (entry.toString().equalsIgnoreCase("Eliptical3")) {

                lstCtTimers.add("1 min  3%   3   Easy  Forward");
                lstTimers.add(60);
                lstCtTimers.add("1 min  4%   3   Easy  Forward");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   3   Easy  Forward");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   8   High  Forward");
                lstTimers.add(120);
                lstCtTimers.add("2 min  5%   10  High  Backward");
                lstTimers.add(120);
                lstCtTimers.add("1 min  10%  5   Mod  Hands off");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   12  High  Forward");
                lstTimers.add(120);
                lstCtTimers.add("2 min  5%   12  High  Backward");
                lstTimers.add(120);
                lstCtTimers.add("1 min  10%  5   Mod   Hands Off");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   10  High  Forward");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   10  High  Backward");
                lstTimers.add(120);
                lstCtTimers.add("1 min  5%   10  High  Forward");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   8  High  Hands Off");
                lstTimers.add(60);
                lstCtTimers.add("2 min  3%   3  High  Forward");
                lstTimers.add(120);

            }
            if (entry.toString().equalsIgnoreCase("Eliptical4")) {

                lstCtTimers.add("1 min  5%   5  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   10  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12  115 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   14  110 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   0   110 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   10  125 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   14  115 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   0   110 Strokes");
                lstTimers.add(120);
                lstCtTimers.add("1 min  5%   10  125 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12  125 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   14  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   0   110 Strokes");
                lstTimers.add(60);
            }

            if (entry.toString().equalsIgnoreCase("Eliptical5")) {
                lstCtTimers.add("5 min  x%   3   Easy   WarmUp");
                lstTimers.add(300);
                lstCtTimers.add("2 min  x%   4   Mod    HandsOff");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   5   Mod    Backward");
                lstTimers.add(120);
                lstCtTimers.add("1 min  x%   6    High   Forward");
                lstTimers.add(60);
                lstCtTimers.add("2 min  x%   7    Mod    HandsOff");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   8   Mod    Backward");
                lstTimers.add(120);
                lstCtTimers.add("1 min  x%   9    High   Forward");
                lstTimers.add(60);
                lstCtTimers.add("2 min  x%   10    Mod    HandsOff");
                lstTimers.add(120);
                lstCtTimers.add("1 min  x%   MAX   High   Push Hard Arms");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   MAX   High   Pull Hard Arms");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   10    High    HandsOff Sprint");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   10    Easy    Recover");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   9     High    HandsOff Backwards");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   9     Easy    Recover");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   8     High    HandsOff Sprint");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   8     Easy    Recover");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   7     High    HandsOff Backwards");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   7     High    Recover");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   MAX   High   Push Hard Arms");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   MAX   High   Pull Hard Arms");
                lstTimers.add(60);
                lstCtTimers.add("1 min  x%   None   High   Sprint");
                lstTimers.add(60);
            }

            if (entry.toString().equalsIgnoreCase("Eliptical6")) {

                lstCtTimers.add("3 min  x%   1 ");
                lstTimers.add(180);
                lstCtTimers.add("2 min  x%   2 ");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   4 ");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   2 ");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   6 ");
                lstTimers.add(120);
                lstCtTimers.add("1 min  x%   2 ");
                lstTimers.add(60);
                lstCtTimers.add("2 min  x%   8 ");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   1 ");
                lstTimers.add(120);


            }

            if (entry.toString().equalsIgnoreCase("Eliptical7")) {

                lstCtTimers.add("3 min  5%   5  120 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  5%   8  115 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   5   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   10  160 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   5   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12  150 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   5   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add(".5 min  5%   12  160 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1.5 min  5%   0   110 Strokes");
                lstTimers.add(90);
                lstCtTimers.add(".5 min  5%   12  170 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  5%     5  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add(".5 min  5%   12  170 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  5%   5   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add(".5 min  5%   12   170 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  5%   5  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add(".5 min  5%   12   170 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  5%   5  120 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  5%     0  110 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12  125 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   12   120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  5%   14  115 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   0   110 Strokes");
                lstTimers.add(120);
                lstCtTimers.add("2 min  5%   12  125 Strokes");
                lstTimers.add(120);
                lstCtTimers.add("1 min  5%    14  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("2 min  5%   0  110 Strokes");
                lstTimers.add(30);
            }

            if (entry.toString().equalsIgnoreCase("Eliptical8")) {

                lstCtTimers.add("3 min  x%   1  Warm Up");
                lstTimers.add(180);
                lstCtTimers.add("3 min  x%   3  Forward");
                lstTimers.add(180);
                lstCtTimers.add("2 min  x%   3  Backward");
                lstTimers.add(120);
                lstCtTimers.add("3 min  x%   6  Forward");
                lstTimers.add(180);
                lstCtTimers.add("2 min  x%   6  Backward");
                lstTimers.add(120);
                lstCtTimers.add("3 min  x%   9  Forward");
                lstTimers.add(180);
                lstCtTimers.add("2 min  x%   9  Backward");
                lstTimers.add(120);
                lstCtTimers.add("3 min  x%   12  Forward");
                lstTimers.add(180);
                lstCtTimers.add("2 min  x%   12  Backward");
                lstTimers.add(120);
                lstCtTimers.add("2 min  x%   1  Cool Down");
                lstTimers.add(120);


            }

            if (entry.toString().equalsIgnoreCase("Eliptical9")) {

                lstCtTimers.add("3 min  3%   5  120 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  3%   10 150 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  3%   5  120 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  3%   10 160 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  3%   5  120 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  3%   12 150 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  3%   5  120 Strokes");
                lstTimers.add(60);
                lstCtTimers.add(".5 min  3%   12 160 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1.5 min  3%  10  110 Strokes");
                lstTimers.add(90);
                lstCtTimers.add("1 min   3%   8    170 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1 min  3%   5  120 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  3%   10 160 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("1.5 min  3%   5  120 Strokes");
                lstTimers.add(90);
                lstCtTimers.add(".5 min  3%   10 170 Strokes");
                lstTimers.add(30);
                lstCtTimers.add("1 min  3%   0   110 Strokes");
                lstTimers.add(60);
                lstCtTimers.add("3 min  3%   12  110 Strokes");
                lstTimers.add(180);
                lstCtTimers.add("1 min  3%   3   <120 Strokes");
                lstTimers.add(60);


            }



            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
