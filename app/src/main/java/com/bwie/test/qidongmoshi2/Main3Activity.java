package com.bwie.test.qidongmoshi2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onstart3------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume3-----------------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause3------------------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop3------------------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy3------------------------------------");
    }
}
