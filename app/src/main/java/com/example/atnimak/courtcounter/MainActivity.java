package com.example.atnimak.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayFromTeamA(scoreTeamA);
    }

    public void displayFromTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void plusThree(View view){
        scoreTeamA+=3;
        displayFromTeamA(scoreTeamA);
    }

    public void plusTwo(View view){
        scoreTeamA+=2;
        displayFromTeamA(scoreTeamA);
    }

    public void freeThrow(View view){
        scoreTeamA+=1;
        displayFromTeamA(scoreTeamA);

    }


}
