package com.bwie.test.qidongmoshi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate------------------------------------");
        bu1 = (Button) findViewById(R.id.bu1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onstart------------------------------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onstart------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume-----------------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause------------------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop------------------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy------------------------------------");
    }
}
