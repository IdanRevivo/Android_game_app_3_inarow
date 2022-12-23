package com.game.connect_three_inarow_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Game states: 0 Yellow, 1 Red, 2 Empty
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[] [] winningPositions = {{3, 1, 0}, {4, 2, 8}, {5, 6, 7}, {7, 8, 0}, {6, 2, 1}, {3, 4, 5},
                                {3, 2, 7}, {0, 2, 5}};

    int activeUser = 0;

    public void dropIn(View view){

        ImageView counter = (ImageView) view;

        Log.i("tag: ", counter.getTag().toString());

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        gameState[tappedCounter] = activeUser;

        counter.setTranslationY(-1500);
        if (activeUser == 0) {
            counter.setImageResource(R.drawable.yellow);
            activeUser = 1;
        }
        else {
            counter.setImageResource(R.drawable.red);
            activeUser = 0;
        }

        counter.animate().translationYBy(1500).setDuration(300);

        for (int [] winningPosition : winningPositions) {
            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]] != 2){

                String winner = "";
                if (activeUser == 1){
                    winner = "Yellow";
                }

                else {
                    winner = "Red";
                }
                Toast.makeText(this, winner + " has won", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}