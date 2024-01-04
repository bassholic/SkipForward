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

public class TwentyOneDay extends Activity {
    public static List<Integer> lstTimers;
    public  static List<String> lstCtTimers;
    private ListView ctItems;


    ArrayAdapter listCtAdapter;

    MainActivityRunHR MA = new MainActivityRunHR();
    ModuleRun MR = new ModuleRun();
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

            if (entry.toString().equalsIgnoreCase("21DayMWR" ) && MR.whatWeek=="one") {

                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("2  min Jog");
                lstTimers.add(120);
            }

           else if (entry.toString().equalsIgnoreCase("21DayMWR" ) && MR.whatWeek=="two") {

                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("1:45  min Jog");
                lstTimers.add(105);
            }

            else if (entry.toString().equalsIgnoreCase("21DayMWR" ) && MR.whatWeek=="three") {

                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("1:30  min Jog");
                lstTimers.add(90);
            }

            else if (entry.toString().equalsIgnoreCase("21DayF")&& MR.whatWeek=="one" ) {

                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
                lstCtTimers.add("10 sec Sprint");
                lstTimers.add(10);
                lstCtTimers.add("90 sec Jog");
                lstTimers.add(90);
            }

            else if (entry.toString().equalsIgnoreCase("21DayF")&& MR.whatWeek=="two" ) {

                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("75 sec Jog");
                lstTimers.add(75);
            }

            else if (entry.toString().equalsIgnoreCase("21DayF")&& MR.whatWeek=="three" ) {

                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
            }

            else if (entry.toString().equalsIgnoreCase("21DayS")&& MR.whatWeek=="one") {

                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
                lstCtTimers.add("15 sec Sprint");
                lstTimers.add(15);
                lstCtTimers.add("60 sec Jog");
                lstTimers.add(60);
            }

            else if (entry.toString().equalsIgnoreCase("21DayS")&& MR.whatWeek=="two") {

                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
                lstCtTimers.add("20 sec Sprint");
                lstTimers.add(20);
                lstCtTimers.add("45 sec Jog");
                lstTimers.add(45);
            }

            else if (entry.equalsIgnoreCase("21DayS")&& MR.whatWeek=="three") {

                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
                lstCtTimers.add("25 sec Sprint");
                lstTimers.add(25);
                lstCtTimers.add("30 sec Jog");
                lstTimers.add(30);
            }

            MA.lstTimers = lstTimers;
            MA.lstCtTimers = lstCtTimers;

        }
    }

}
