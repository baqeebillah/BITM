package com.acrophillic.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Default(View view) {
        Intent intent = new Intent(this, AndroidListView.class);
        startActivity(intent);
    }

    public void customRaw(View view) {
        Intent intent = new Intent(this, CustomRow.class);
        startActivity(intent);
    }


}
