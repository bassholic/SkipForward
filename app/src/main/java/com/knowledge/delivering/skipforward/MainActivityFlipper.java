package com.knowledge.delivering.skipforward;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import static android.view.KeyEvent.ACTION_DOWN;

/**
 * Created by v633015 on 3/27/2018.
 */

public class MainActivityFlipper extends AppCompatActivity {
    private ViewFlipper mViewFlipper;
    private float initialX;

    ImageButton imageButtonBike;
    ImageButton imageButtonRun;
    ImageButton imageButtonJump;
    Button bikeModule;
    Button runModule;
    Button jumpModule;
    Button customModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepageflipper);
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setInAnimation(this, android.R.anim.fade_in);
        mViewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

       // imageButtonBike = (ImageButton)  findViewById(R.id.bikeButton);
        //imageButtonRun = (ImageButton)  findViewById(R.id.runButton);
       // imageButtonJump = (ImageButton)  findViewById(R.id.jumpButton);
        bikeModule = (Button) findViewById(R.id.bikeModule);
        runModule = (Button) findViewById(R.id.runModule);
        jumpModule = (Button) findViewById(R.id.jumpModule);
        customModule = (Button) findViewById(R.id.customModule);

        /*imageButtonBike.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), BikeModule.class);

                startActivity(nextScreen);

            }
        });*/

        bikeModule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleBike.class);

                startActivity(nextScreen);

            }
        });

       /* imageButtonRun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityRun.class);

                startActivity(nextScreen);

            }
        });*/

        runModule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleRun.class);

                startActivity(nextScreen);

            }
        });

        /*imageButtonJump.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityJump.class);

                startActivity(nextScreen);

            }
        });*/

        jumpModule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), ModuleJump.class);

                startActivity(nextScreen);

            }
        });
       /* Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        // set the animation type to ViewFlipper
        mViewFlipper.setInAnimation(in);
        mViewFlipper.setOutAnimation(out);
*/
        customModule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityCustom.class);

                startActivity(nextScreen);

            }
        });
    }



        @Override
        public boolean onTouchEvent(MotionEvent touchevent){
            switch (touchevent.getAction()) {
                case ACTION_DOWN:
                    initialX = touchevent.getX();
                    break;
                case MotionEvent.ACTION_UP:
                    float finalX = touchevent.getX();
                    if (initialX > finalX) {
                        if (mViewFlipper.getDisplayedChild() == 3)
                            break;

                       mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.in_from_left));
                       mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.out_from_left));

                        mViewFlipper.showNext();
                    } else {
                        if (mViewFlipper.getDisplayedChild() == 0)
                            break;

                        mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.in_from_right));
                        mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.out_from_right));

                        mViewFlipper.showPrevious();
                    }
                    break;
            }
            return false;


        }

}
