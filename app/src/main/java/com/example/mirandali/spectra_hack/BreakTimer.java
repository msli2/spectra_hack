package com.example.mirandali.spectra_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakTimer extends AppCompatActivity{
    private Button button_BacktoWork;
    private Button button_newActivity;
    private Button button_imDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.break_timer);
        button_BacktoWork = (Button) findViewById(R.id.button_BackToWork);
        button_newActivity = (Button) findViewById(R.id.button_newActivity);
        button_imDone = (Button) findViewById(R.id.button_imDone);

        button_BacktoWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WorkTime();
            }
        });
        button_newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNewActivity();
            }
        });
        button_imDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doneWithWork();
            }
        });
    }
    public void WorkTime() {
        Intent a = new Intent(BreakTimer.this, WorkTimer.class);
        startActivity(a);
    }
    public void generateNewActivity(){
    }
    public void doneWithWork() {
        Intent a = new Intent(BreakTimer.this, Done.class);
        startActivity(a);
    }
}