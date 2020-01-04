package com.wmy.learning.mycloudmusic.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.wmy.learning.mycloudmusic.R;

public class SplashActivity extends BaseCommonActivity {
    private static final String TAG = "SplashActivity";
    private static final int MESSAGE_NEXT=0;
    private static final long DEFAULT_MESSAGE_TIME = 3000 ;

    /**
     * 创建Handler
     *
     * 这样创建有内存泄漏
     * 在性能优化我们具体讲解
     */
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_NEXT:
                    next();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //全屏显示
        fullScreen();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(MESSAGE_NEXT);

            }
        },DEFAULT_MESSAGE_TIME);
    }

    private void next() {
        startActivityAfterFinishThis(GuideActivity.class);

    }


}
