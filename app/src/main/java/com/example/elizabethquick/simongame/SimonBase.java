package com.example.elizabethquick.simongame;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.LinearLayout;


public class SimonBase extends ActionBarActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
    LinearLayout green;
    LinearLayout red;
    LinearLayout yellow;
    LinearLayout blue;
    GestureDetectorCompat gDetect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simon_base);
        green = (LinearLayout)findViewById(R.id.green);
        red = (LinearLayout)findViewById(R.id.red);
        yellow = (LinearLayout)findViewById(R.id.yellow);
        blue = (LinearLayout)findViewById(R.id.blue);
        this.gDetect = new GestureDetectorCompat(this,this);
        gDetect.setOnDoubleTapListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simon_base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        /*if(e.getRawY() > green.getTop() && e.getRawY() < green.getBottom()){
            if(e.getRawX() > green.getLeft() && e.getRawX() < green.getRight()){
                green.setBackgroundColor(0xff00ff00);
                return true;
            }else if(e.getRawX() > red.getLeft() && e.getRawX() < red.getRight()){
                red.setBackgroundColor(0xffff0000);
                return true;
            }else{
                return false;
            }
        }else if(e.getRawY() > yellow.getTop() && e.getRawY() < yellow.getBottom()){
            if(e.getRawX() > yellow.getLeft() && e.getRawX() < yellow.getRight()){
                yellow.setBackgroundColor(0xffffff00);
                return true;
            }else if(e.getRawX() > blue.getLeft() && e.getRawX() < blue.getRight()){
                blue.setBackgroundColor(0xff0000ff);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }*/
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        if(e.getRawY() > green.getTop() && e.getRawY() < green.getBottom()){
            if(e.getRawX() > green.getLeft() && e.getRawX() < green.getRight()){
                green.setBackgroundColor(0xff00ff00);
                return true;
            }else if(e.getRawX() > red.getLeft() && e.getRawX() < red.getRight()){
                red.setBackgroundColor(0xffff0000);
                return true;
            }else{
                return false;
            }
        }else if(e.getRawY() > yellow.getTop() && e.getRawY() < yellow.getBottom()){
            if(e.getRawX() > yellow.getLeft() && e.getRawX() < yellow.getRight()){
                yellow.setBackgroundColor(0xffffff00);
                return true;
            }else if(e.getRawX() > blue.getLeft() && e.getRawX() < blue.getRight()){
                blue.setBackgroundColor(0xff0000ff);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        if(e.getRawY() > green.getTop() && e.getRawY() < green.getBottom()){
            if(e.getRawX() > green.getLeft() && e.getRawX() < green.getRight()){
                green.setBackgroundColor(0x7b00ff00);
                return true;
            }else if(e.getRawX() > red.getLeft() && e.getRawX() < red.getRight()){
                red.setBackgroundColor(0x7bff0000);
                return true;
            }else{
                return false;
            }
        }else if(e.getRawY() > yellow.getTop() && e.getRawY() < yellow.getBottom()){
            if(e.getRawX() > yellow.getLeft() && e.getRawX() < yellow.getRight()){
                yellow.setBackgroundColor(0x7bffff00);
                return true;
            }else if(e.getRawX() > blue.getLeft() && e.getRawX() < blue.getRight()){
                blue.setBackgroundColor(0x7b0000ff);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
