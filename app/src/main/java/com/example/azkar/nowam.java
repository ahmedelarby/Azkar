package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tyrantgit.explosionfield.ExplosionField;

public class nowam extends AppCompatActivity {

MediaPlayer nowam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowam);

        nowam=MediaPlayer.create(this,R.raw.nom);
    }

    public void play_mahary(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();
        nowam.start();
    }

    public void stop_mahary(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        nowam.pause();
    }

    public void exit(View view) {
        Toast.makeText(this, "جاري الخروج نهائيا", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    public void Back_to_main_menu(View view) {

        Toast.makeText(this, "جاري الرجوع الي القائمه السابقه", Toast.LENGTH_SHORT).show();
        onBackPressed();
    }
}
