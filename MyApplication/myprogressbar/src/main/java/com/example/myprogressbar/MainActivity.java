package com.example.myprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressbar;
    private ProgressBar progressbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressbar = findViewById(R.id.pb);
        progressbar2 = findViewById(R.id.pb2);
    }

    public void controlProgressBar(View view) {
        /*如果当前是progressbar隐藏的*/
        if(progressbar.getVisibility() == View.GONE){
            progressbar.setVisibility(View.VISIBLE);
        }else{
            progressbar.setVisibility(View.GONE);
        }
    }

    public void load(View view) {
        // 获取当前进度条的进度
        int progress = progressbar2.getProgress();
        progress+=10;
        progressbar2.setProgress(progress);
    }
}