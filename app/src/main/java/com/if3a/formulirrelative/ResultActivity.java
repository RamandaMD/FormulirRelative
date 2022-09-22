package com.if3a.formulirrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNPM, tvNama,tvJK,tvProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNPM = findViewById(R.id.tv_npm);
        tvNama = findViewById(R.id.tv_nama);
        tvJK = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);

        Intent intent = getIntent();
        tvNPM.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvJK.setText(intent.getStringExtra("varJK"));
        tvProdi.setText(intent.getStringExtra("varProdi"));
    }
}