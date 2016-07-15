package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int team_a = 0, team_b = 0;

    public void display() {
        TextView scoreView_a = (TextView) findViewById(R.id.team_a_score);
        scoreView_a.setText(String.valueOf(team_a));
        TextView scoreView_b = (TextView) findViewById(R.id.team_b_score);
        scoreView_b.setText(String.valueOf(team_b));
    }

    public void btnClick(View view) {
        int btnId = view.getId();

        switch (btnId) {
            case R.id.team_a_1:
                team_a += 1;
                break;
            case R.id.team_a_2:
                team_a += 2;
                break;
            case R.id.team_a_3:
                team_a += 3;
                break;
            case R.id.team_b_1:
                team_b += 1;
                break;
            case R.id.team_b_2:
                team_b += 2;
                break;
            case R.id.team_b_3:
                team_b += 3;
                break;
            case R.id.reset:
                team_a = 0;
                team_b = 0;
                break;
        }
        display();
    }
}
