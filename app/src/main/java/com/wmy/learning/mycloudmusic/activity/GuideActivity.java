package com.wmy.learning.mycloudmusic.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.wmy.learning.mycloudmusic.MainActivity;
import com.wmy.learning.mycloudmusic.R;
import com.wmy.learning.mycloudmusic.adapter.GuideAdapter;
import com.wmy.learning.mycloudmusic.fragment.GuideFragment;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class GuideActivity extends BaseCommonActivity implements View.OnClickListener{
    private Button mLoginAndRegister;
    private Button mEnter;
    private ViewPager vp;
    private GuideAdapter adapter;
    //指示器
    private CircleIndicator ci;

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
        vp = findViewById(R.id.vp);
        ci = findViewById(R.id.ci);

       /* //测试显示fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, GuideFragment.newInstance(R.drawable.guide2))
                .commit();*/
    }

    @Override
    protected void initDatum() {
        super.initDatum();
        adapter = new GuideAdapter(getMainActivity(), getSupportFragmentManager());
        vp.setAdapter(adapter);
        ci.setViewPager(vp);
        adapter.registerDataSetObserver(ci.getDataSetObserver());

        List<Integer> datum = new ArrayList<>();
        datum.add(R.drawable.guide1);
        datum.add(R.drawable.guide2);
        datum.add(R.drawable.guide3);
        datum.add(R.drawable.guide4);
        datum.add(R.drawable.guide5);
        adapter.setDatum(datum);

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
                startActivityAfterFinishThis(LoginOrRegisterActivity.class);
                setNotShowGuide();
                break;
            case R.id.bt_enter:
                //跳转到首页
                startActivityAfterFinishThis(MainActivity.class);
                setNotShowGuide();
                break;
            default:
                break;
        }
    }

    private void setNotShowGuide() {
        sp.setIsShowGuide(false);
    }
}
