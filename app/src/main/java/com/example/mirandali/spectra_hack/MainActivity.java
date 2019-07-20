package com.example.mirandali.spectra_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_begin = (Button) findViewById(R.id.button_begin);

        button_begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOpenSelectWorkTime();
            }
        });
    }

    public void getOpenSelectWorkTime() {
        Intent a = new Intent(MainActivity.this, SelectWorkTime.class);
        startActivity(a);
    }
}
