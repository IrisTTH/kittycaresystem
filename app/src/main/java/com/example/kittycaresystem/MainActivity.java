package com.example.kittycaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Log log;
    private Button BTLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.BTLogin);
        /** 按鈕註冊的功能*/
        btn.setOnClickListener(AA);

        Button btn2 = (Button) findViewById(R.id.bt_register);
        /** 按鈕註冊的功能*/
        btn2.setOnClickListener(EE);

        class OnClick implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "重新檢查帳號密碼",Toast.LENGTH_LONG).show();
                }
            }
        }
    View.OnClickListener AA = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**從MAIN 跳到 SECOND 頁面*/
            Intent intent = new Intent(MainActivity.this, CatData.class);
            /** 啟動intent */
            startActivity(intent);
        }
    };

    View.OnClickListener EE = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**從MAIN 跳到 SECOND 頁面*/
            Intent intent = new Intent(MainActivity.this, Register.class);
            /** 啟動intent */
            startActivity(intent);
        }
    };


    private void login(view view)
    {
        //調用
        EditText txtbreederID = findViewById(R.id.etbreederID);
        EditText txtpassword = findViewById(R.id.etpassword);

        //取出value
        String BreederID = txtbreederID.getText().toString();
        String password = txtpassword.getText().toString();

        if(BreederID.equals("Shan") && password.equals("123456"))
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity (intent);
        }
        else
        {
            String message = "Username or password incorrect.";

            TextView tvMsg = findViewById(R.id.tv_Msg);

            tvMsg.setText(message);
        }
    }

    public void LOGIN(View view) {
        log.i("system","登入完成");
    }




}
