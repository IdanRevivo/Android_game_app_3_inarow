package com.game.connect_three_inarow_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){

        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1500);

        counter.setImageResource(R.drawable.yellow);

        counter.animate().translationYBy(1500).setDuration(300);

        Log.i("Info", "The image has been clicked");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}