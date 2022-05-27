package com.example.kittycaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn = (Button)findViewById(R.id.finish);
        /** 按鈕註冊的功能*/
        btn.setOnClickListener(DD);
    }

    View.OnClickListener DD = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**從MAIN 跳到 SECOND 頁面*/
            Intent intent = new Intent(Register.this, MainActivity.class);
            /** 啟動intent */
            startActivity(intent);
        }
    };
}