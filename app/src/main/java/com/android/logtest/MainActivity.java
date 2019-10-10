package com.android.logtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYTAG", "onCreate State");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG", "onStart State");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG", "onResume State");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG", "onPause State");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG", "onStop State");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG", "onDestroy State");
    }
}
