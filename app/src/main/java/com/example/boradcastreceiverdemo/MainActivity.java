package com.example.boradcastreceiverdemo;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ipNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ipNumber = findViewById(R.id.et_ipNumber);
    }

    public void click(View view) {
        String number = ipNumber.getText().toString().trim();

        SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE);
        sp.edit().putString("number",number).apply();

        Toast.makeText(getApplicationContext(),"保存成功",Toast.LENGTH_SHORT).show();
    }
}
