package com.wmy.learning.mycloudmusic.activity;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 所有activity父类
 */
public class BaseActivity extends AppCompatActivity {

    protected void initView() {

    }
    protected void initDatum() {

    }
    protected void initListeners() {

    }
    private void init() {
        initView();
        initDatum();
        initListeners();
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        init();
    }

    public BaseActivity getMainActivity() {
        return this;
    }
}
