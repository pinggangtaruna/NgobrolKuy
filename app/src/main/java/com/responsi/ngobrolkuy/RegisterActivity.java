package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {


    private TextView regis,sudahkok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regis = findViewById(R.id.registrasi);
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent pindah = new Intent(RegisterActivity.this, ProfilePicActivity.class);
                startActivity(pindah);
            }
        });

    }
}