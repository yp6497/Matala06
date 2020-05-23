package com.example.matala06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = (Switch) findViewById(R.id.sw);
        tb = (ToggleButton) findViewById(R.id.tb);
    }

    public void go(View view) {
        if(sw.isChecked() && tb.isChecked())
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        if(!sw.isChecked() && !tb.isChecked())
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        if(sw.isChecked() && !tb.isChecked())
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        if(!sw.isChecked() && tb.isChecked())
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
    }
}

