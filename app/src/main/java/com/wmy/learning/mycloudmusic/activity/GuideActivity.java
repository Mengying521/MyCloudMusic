package com.wmy.learning.mycloudmusic.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wmy.learning.mycloudmusic.R;

public class GuideActivity extends BaseCommonActivity implements View.OnClickListener{
    private Button mLoginAndRegister;
    private Button mEnter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_guide);
    }

    @Override
    protected void initView() {
        super.initView();
        hideStatusBar();
        mLoginAndRegister = findViewById(R.id.bt_login_register);
        mEnter = findViewById(R.id.bt_enter);
    }

    @Override
    protected void initDatum() {
        super.initDatum();
    }

    @Override
    protected void initListeners() {
        super.initListeners();
        mLoginAndRegister.setOnClickListener(this);
        mEnter.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login_register:
                break;
            case R.id.bt_enter:
                break;
            default:
                break;
        }
    }
}
