package com.example.pc.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teama = 0,
            teamb = 0,
            wicketA = 0,
            wicketB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add1(View view) {
        teama += 1;
        displayA(teama);
    }

    public void add2(View view) {
        teama += 2;
        displayA(teama);
    }

    public void add3(View view) {
        teama += 3;
        displayA(teama);
    }

    public void wicketA(View view) {
        wicketA += 1;
        displaywicketA(wicketA);
    }

    public void displaywicketA(int number) {
        TextView textView = (TextView) findViewById(R.id.wicket);
        textView.setText("" + number);
    }

    public void badd1(View view) {
        teamb += 1;
        displayB(teamb);
    }

    public void badd2(View view) {
        teamb += 2;
        displayB(teamb);
    }

    public void badd3(View view) {
        teamb += 3;
        displayB(teamb);
    }

    public void wicketB(View view) {
        wicketB += 1;
        displaywicketB(wicketB);
    }

    public void displaywicketB(int number) {
        TextView textView = (TextView) findViewById(R.id.wicketB);
        textView.setText("" + number);
    }

    public void reset(View view) {
        teama = 0;
        teamb = 0;
        wicketA = 0;
        wicketB = 0;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("0");


        TextView txtView1 = (TextView) findViewById(R.id.wicket);
        txtView1.setText("0");


        TextView text = (TextView) findViewById(R.id.wicketB);
        text.setText("0");

    }

    private void displayA(int number) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("" + number);

    }

    private void displayB(int number) {
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("" + number);
    }
}
