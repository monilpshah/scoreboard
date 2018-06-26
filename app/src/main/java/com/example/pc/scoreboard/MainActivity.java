package com.example.pc.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teama=0;
    int teamb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA(View view) {
        teama+=1;
        displayA(teama);
    }

    public void teamB(View view) {
        teamb+=1;
        displayB(teamb);
    }
    public void reset(View view){
        teama=0;
        teamb=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("0");
    }

    private void displayA(int number) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("" + number);
    }

    private void displayB(int number) {
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("" + number);
    }

    private  void  submit(View view){
        TextView submit = (TextView) findViewById(R.id.thankyou);
        if(teama > teamb){
        submit.setText("Conratulations!! TEAM A  hank you for playing");}
        else{
            submit.setText("Conratulations!! TEAM B  Thank you for playing");}
    }

}
