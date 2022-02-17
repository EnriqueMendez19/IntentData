package com.example.sendinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText EtSend;
     Button BtSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtSend=findViewById(R.id.click);
        BtSend=findViewById(R.id.send);
        BtSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle sendInfo=new Bundle();
                sendInfo.putString("keyDatos",EtSend.getText().toString());
                Intent intent=new Intent(MainActivity.this, Info.class);
                intent.putExtras(sendInfo);
                startActivity(intent);
            }
        });
    }
}