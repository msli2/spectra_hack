package com.example.mirandali.spectra_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionAndBreak extends AppCompatActivity{
    private Button button_startWorking;
    private Button button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_and_break);

        button_back = (Button) findViewById(R.id.button_back);
        button_startWorking = (Button) findViewById(R.id.button_startworking);

        button_startWorking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOpenSelectWorkTimeOne();
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOpenSelectWorkTimeTwo();
            }
        });
    }
    public void getOpenSelectWorkTimeOne() {
        Intent a = new Intent(SelectionAndBreak.this, WorkTimer.class);
        startActivity(a);
    }

    public void getOpenSelectWorkTimeTwo() {
        Intent b = new Intent(SelectionAndBreak.this, SelectWorkTime.class);
        startActivity(b);
    }
}