package com.mirea.lavrenov.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    private String TAG = LifeCycleActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle outState){
        super.onRestoreInstanceState(outState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "onPostCreate");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart");
    }
}