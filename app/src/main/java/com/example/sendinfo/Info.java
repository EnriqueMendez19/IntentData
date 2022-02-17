package com.example.sendinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {
      TextView GetInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        GetInfo=findViewById(R.id.info);
        Bundle ObtainInfo=getIntent().getExtras();
        String info= ObtainInfo.getString("keyDatos");
        GetInfo.setText(info);
    }
}