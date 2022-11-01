package com.responsi.ngobrolkuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    private TextView belumpyn;
    private TextView tombol;
    private TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        belumpyn = findViewById(R.id.belum);
        belumpyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent pindah = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindah);
            }
        });
        tombol = findViewById(R.id.tmbllgn);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent pindah = new Intent(LoginActivity.this, ChatActivity.class);
                startActivity(pindah);
            }
        });
        forgot = findViewById(R.id.lupa);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent pindah = new Intent(LoginActivity.this, LupaActivity.class);
                startActivity(pindah);
            }
        });


    }
}