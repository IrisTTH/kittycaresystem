package com.example.kittycaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CatData extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cat_data);

        Button btn = (Button)findViewById(R.id.AddCatInformation);
        /** 按鈕註冊的功能*/
        btn.setOnClickListener(BB);
    }

    View.OnClickListener BB = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**從MAIN 跳到 SECOND 頁面*/
            Intent intent = new Intent(CatData.this, AddCatInfomation.class);
            /** 啟動intent */
            startActivity(intent);
        }
    };
}