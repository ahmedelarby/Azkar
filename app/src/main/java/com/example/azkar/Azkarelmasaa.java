package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Azkarelmasaa extends AppCompatActivity {
MediaPlayer mashary,ahmed,mohmed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkarelmasaa);

        mashary=MediaPlayer.create(this,R.raw.m_m);
        ahmed = MediaPlayer.create(this,R.raw.a_m_a);
        mohmed=MediaPlayer.create(this,R.raw.a_m_mohmed);
    }

    public void play_mahary(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();
        mashary.start();
    }

    public void stop_mahary(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        mashary.pause();
    }

    public void play_ahmed(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();
        ahmed.start();
    }

    public void stop_ahmed(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        ahmed.pause();
    }

    public void play_mohmed(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();
        mohmed.start();

    }

    public void stop_mohmed(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        mohmed.pause();
    }

    public void exit(View view) {
        Toast.makeText(this, "جاري الخروج نهائيا", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    public void Back_to_main_menu(View view) {
        Toast.makeText(this, "جاري الرجوع الي الخلف", Toast.LENGTH_SHORT).show();
        onBackPressed();
    }
}
