package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG = "Hello World";
    // 用户  密码  全局
    private EditText user,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*获取控件,通过id获取*/
//        TextView tv_one = findViewById(R.id.tv_one);
//        tv_one.setText("Li~");

        /*获取button*/
        Button btn = findViewById(R.id.btn);

        /*点击事件*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"onClick:");
            }
        });

        /*长按事件*/
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG, "onLongClick: " );
                return false;
            }
        });

//        /*触摸事件*/
//        btn.setOnTouchListener(new View.OnTouchListener(){
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "onTouch: " +event.getAction());
//                return false;
//            }
//        });
        /*获取用户名和密码*/
        Button userPwdBtn = findViewById(R.id.getUserBtn);
        user = findViewById(R.id.user);
        pwd = findViewById(R.id.pwd);

        userPwdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = user.getText().toString();
                String pwdText = pwd.getText().toString();
                Log.e("leo","用户名："+userText);
                Log.e("leo","密码："+pwdText );
            }
        });

    }

    public void btnClickFun(View view) {
        Log.e(TAG, "btnClickFun: "+"点击按钮事件提示~" );
    }
}