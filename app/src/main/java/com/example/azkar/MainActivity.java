package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        text1 = (TextView)findViewById(R.id.text1);
        MediaPlayer i = MediaPlayer.create(this,R.raw.mqdma);
        i.start();
        YoYo.with(Techniques.SlideInRight )
                .duration(700)
                .repeat(25)
                .playOn(findViewById(R.id.text1));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "جاري الدخول ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        },18000);
    }


}
