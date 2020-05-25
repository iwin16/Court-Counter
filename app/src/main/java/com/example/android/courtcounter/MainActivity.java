package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;
    public void score3A(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void score2A(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void score3B(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void score2B(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));

    }
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));

    }
}
