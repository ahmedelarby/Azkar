package com.example.azkar;

import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class azkar_elsbah extends AppCompatActivity {
    MediaPlayer mahary, ahmed, mohamed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_elsbah);
        mahary = MediaPlayer.create(azkar_elsbah.this, R.raw.sm);
        ahmed = MediaPlayer.create(azkar_elsbah.this, R.raw.a_s_a);
        mohamed = MediaPlayer.create(azkar_elsbah.this, R.raw.a_s_mahmed);

    }

    public void play_mahary(View view) {
        Toast.makeText(this, "جاري التشغيل ", Toast.LENGTH_SHORT).show();
        mahary.start();


    }

    public void stop_mahary(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();

        mahary.pause();

    }

    public void play_ahmed(View view) {
        Toast.makeText(this, "جاري التشغيل ", Toast.LENGTH_SHORT).show();

        ahmed.start();

    }

    public void stop_ahmed(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();

        ahmed.pause();

    }

    public void play_mohmed(View view) {
        Toast.makeText(this, "جاري التشغيل ", Toast.LENGTH_SHORT).show();

        mohamed.start();

    }

    public void stop_mohmed(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();

        mohamed.pause();

    }

    public void exit(View view) {
        Toast.makeText(this, "جاري الخروج نهائيا", Toast.LENGTH_SHORT).show();
        finishAffinity();

    }

    public void Back_to_main_menu(View view) {
        Toast.makeText(this, "جاري الرجوع الي الخلف ", Toast.LENGTH_SHORT).show();
        onBackPressed();

    }
}