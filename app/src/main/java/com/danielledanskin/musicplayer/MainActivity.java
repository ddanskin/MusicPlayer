package com.danielledanskin.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.bells_tibetan_daniel_simon);
    }

    public void startMusic(View view) {
        mediaPlayer.start();
    }

    public void stopMusic(View view) {
        mediaPlayer.pause();
    }
}
