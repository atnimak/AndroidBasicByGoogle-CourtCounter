package com.example.atnimak.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayFromTeamA(scoreTeamA);
        displayFromTeamB(scoreTeamB);
    }

    public void displayFromTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFromTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addThreeForTeamA(View view){
        scoreTeamA+=3;
        displayFromTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreTeamA+=2;
        displayFromTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view){
        scoreTeamA+=1;
        displayFromTeamA(scoreTeamA);

    }


    public void addThreeForTeamB(View view) {
        scoreTeamB+=3;
        displayFromTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB+=2;
        displayFromTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB+=1;
        displayFromTeamB(scoreTeamB);
    }

    public void resetScores(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayFromTeamA(scoreTeamA);
        displayFromTeamB(scoreTeamB);
    }
}
