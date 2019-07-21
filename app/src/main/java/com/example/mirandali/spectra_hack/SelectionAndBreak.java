package com.example.mirandali.spectra_hack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionAndBreak extends AppCompatActivity{
    private Button button_startWork;
    private Button button_backward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_and_break);
        button_startWork = (Button) findViewById(R.id.button_startWork);
        button_backward = (Button) findViewById(R.id.button_backward);

        button_startWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOpenSelectWorkTime();
            }
        });

        button_backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }
    public void getOpenSelectWorkTime() {
        Intent a = new Intent(SelectionAndBreak.this, WorkTimer.class);
        startActivity(a);
    }

    public void goBack() {
        Intent b = new Intent(SelectionAndBreak.this, SelectWorkTime.class);
        startActivity(b);
    }
}