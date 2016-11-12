package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int teamScoreA;
     int teamScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threePointerA(View view)
    {
        teamScoreA+=3;
        displayTeamA(teamScoreA);
    }
    public void TwoPointerA(View view)
    {
        teamScoreA+=2;
        displayTeamA(teamScoreA);
    }
    public void FreePointerA(View view)
    {
        teamScoreA+=1;
        displayTeamA(teamScoreA);
    }
    public void displayTeamB(int score)
    {
        TextView t =(TextView)findViewById(R.id.team_b_score);
        t.setText(String.valueOf(score));
    }
    public void threePointerB(View view)
    {
        teamScoreB+=3;
        displayTeamB(teamScoreB);
    }
    public void TwoPointerB(View view)
    {
        teamScoreB+=2;
        displayTeamB(teamScoreB);
    }
    public void FreePointerB(View view)
    {
        teamScoreB+=1;
        displayTeamB(teamScoreB);
    }
    public void displayTeamA(int score)
    {
        TextView t =(TextView)findViewById(R.id.team_a_score);
        t.setText(String.valueOf(score));
    }
    public void ResetAB(View view)
    {
        teamScoreA=teamScoreB=0;
        displayTeamA(teamScoreA);
        displayTeamB(teamScoreB);
    }


}
