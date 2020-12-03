package com.example.lofisampler;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playSound(View view){

        Button buttonPressed = (Button) view;
        Log.i("button pressed", buttonPressed.getTag().toString());


        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources()
                .getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));

        mediaPlayer.setLooping(true);

        mediaPlayer.start();

        

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}