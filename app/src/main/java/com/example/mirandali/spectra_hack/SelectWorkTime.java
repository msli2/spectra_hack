package com.example.mirandali.spectra_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectWorkTime extends AppCompatActivity {

    private Button button_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_work_time);
        button_start = (Button) findViewById(R.id.button_startTime);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOpenSelectWorkTime();
            }
        });
    }

    public void getOpenSelectWorkTime() {
        Intent a = new Intent(SelectWorkTime.this, SelectionAndBreak.class);
        startActivity(a);
    }

}
