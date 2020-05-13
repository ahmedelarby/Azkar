package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Azkarelnhar extends AppCompatActivity {
MediaPlayer nahar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkarelnhar);
        nahar = MediaPlayer.create(this,R.raw.nahar);
    }

    public void stop_mahary(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        nahar.pause();
    }

    public void play_mahary(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();

        nahar.start();
    }

    public void Back_to_main_menu(View view) {
        Toast.makeText(this, "جاري الرجوع الي الخلف", Toast.LENGTH_SHORT).show();
        onBackPressed();
    }

    public void exit(View view) {
        Toast.makeText(this, "جاري الخروج نهائيا", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }
}
