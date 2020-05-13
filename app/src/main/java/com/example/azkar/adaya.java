package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class adaya extends AppCompatActivity {
MediaPlayer farg,mashary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaya);
        farg = MediaPlayer.create(this,R.raw.doaa_farg);
        mashary= MediaPlayer.create(this,R.raw.doaa_mashrey);
    }

    public void exit(View view) {
        Toast.makeText(this, "جاري الخروج نهائيا", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    public void Back_to_main_menu(View view) {
        Toast.makeText(this, "جاري الرجوع الي الخلف", Toast.LENGTH_SHORT).show();
        onBackPressed();
    }

    public void play_1(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();
        farg.start();
    }
    public void stop_2(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();

        farg.pause();
    }

    public void stop_1(View view) {
        Toast.makeText(this, "جاري الايقاف", Toast.LENGTH_SHORT).show();
        mashary.pause();
    }

    public void play_2(View view) {
        Toast.makeText(this, "جاري التشغيل", Toast.LENGTH_SHORT).show();

        mashary.start();
    }


}
