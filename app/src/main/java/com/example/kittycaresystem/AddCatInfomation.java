package com.example.kittycaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddCatInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cat_infomation);

        Button btn = (Button)findViewById(R.id.BT_Save);
        /** 按鈕註冊的功能*/
        btn.setOnClickListener(CC);
    }
    View.OnClickListener CC = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**從MAIN 跳到 SECOND 頁面*/
            Intent intent = new Intent(AddCatInfomation.this, CatData.class);
            /** 啟動intent */
            startActivity(intent);
        }
    };


}