package com.game.connect_three_inarow_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int activeUser = 0;

    public void dropIn(View view){

        ImageView counter = (ImageView) view;

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

        Log.i("Info", "The image has been clicked");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}