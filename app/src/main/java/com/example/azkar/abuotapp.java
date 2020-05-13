package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import tyrantgit.explosionfield.ExplosionField;

public class abuotapp extends AppCompatActivity {
TextView t1,t2;
ExplosionField explosionField;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abuotapp);
        b1= (Button)findViewById(R.id.but010);
        b2= (Button)findViewById(R.id.button012);
        t1= (TextView)findViewById(R.id.t1);
        t2= (TextView)findViewById(R.id.t2);
    }

    public void show(View view) {
        explosionField = ExplosionField.attach2Window(this);// هنا نحدد الاكتفتي  اللي بها الشي الذي سينفجر

        explosionField.explode(b1);// بين الاقواس سنحدد الشي الذي يعمل علي شكل انفجار

        Toast.makeText(this, "جاري عرض معلومات مطور البرنامج", Toast.LENGTH_SHORT).show();
        t1.setText(getString(R.string.informtion) +"\n"+
                getString(R.string.informtiom2) +"\n"+
                getString(R.string.informtion3));

    }

    public void show2(View view) {
        explosionField = ExplosionField.attach2Window(this);// هنا نحدد الاكتفتي  اللي بها الشي الذي سينفجر

        explosionField.explode(b2);// بين الاقواس سنحدد الشي الذي يعمل علي شكل انفجار
        Toast.makeText(this, "جاري عرض معلومات الاتصال بمطور البرنامج", Toast.LENGTH_SHORT).show();
        t2.setText(getString(R.string.call)+"\n"+
               getString(R.string.call2)+"\n"+
                getString(R.string.call3)+"\n"+
                getString(R.string.call4)+"\n"+
                getString(R.string.call5)+
                " "
        ) ;
    }
}
