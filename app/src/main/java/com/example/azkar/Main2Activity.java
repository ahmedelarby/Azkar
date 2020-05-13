package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button azkarelsbah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        azkarelsbah =(Button)findViewById(R.id.azkarelsbah);
        azkarelsbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main2Activity.this,azkar_elsbah.class);
                startActivity(a);

            }
        });
    }

    public void izkarelmasaa(View view) {
        Intent b = new Intent(Main2Activity.this,Azkarelmasaa.class);
        startActivity(b);

    }

    public void azkarelnhar(View view) {
        Intent c = new Intent(Main2Activity.this,Azkarelnhar.class);
        startActivity(c);
    }

    public void nowam(View view) {
        Intent d = new Intent(Main2Activity.this,nowam.class);
        startActivity(d);

    }


    public void Adeaya(View view)  {
        Intent e = new Intent(Main2Activity.this,adaya.class);
        startActivity(e);
    }

    public void about(View view) {
        Intent f = new Intent(Main2Activity.this,abuotapp.class);
        startActivity(f);
    }

    public void off(View view) {
        Toast.makeText(this, "جاري الخروج", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }
}
