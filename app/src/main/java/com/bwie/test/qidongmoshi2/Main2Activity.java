package com.bwie.test.qidongmoshi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button bu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bu2 = (Button) findViewById(R.id.bu2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onstart2------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume2-----------------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause2------------------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop2------------------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy2------------------------------------");
    }
}
