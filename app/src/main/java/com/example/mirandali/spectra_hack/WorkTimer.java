package com.example.mirandali.spectra_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkTimer extends AppCompatActivity{
    private Button button_breakTime;
    private Button button_Pause;
    private Button button_imDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.break_timer);

        button_breakTime = (Button) findViewById(R.id.button_breakTime);
        button_Pause = (Button) findViewById(R.id.button_Pause);
        button_imDone = (Button) findViewById(R.id.button_imDone);

        button_breakTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itsBreakTime();
            }
        });
        button_Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause_clock();
            }
        });
        button_imDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doneWithWork();
            }
        });
    }
    public void itsBreakTime() {
        Intent a = new Intent(WorkTimer.this, BreakTimer.class);
        startActivity(a);
    }
    public void pause_clock(){
    }
    public void doneWithWork() {
        Intent b = new Intent(WorkTimer.this, Done.class);
        startActivity(b);
    }
}