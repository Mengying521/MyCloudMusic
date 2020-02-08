package com.wmy.learning.mycloudmusic.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wmy.learning.mycloudmusic.R;
import com.wmy.learning.mycloudmusic.activity.BaseCommonActivity;
import com.wmy.learning.mycloudmusic.utils.Constant;

/**
 * 引导界面Fragment
 */
public class GuideFragment extends BaseCommonFragment {
    private ImageView iv;


    public GuideFragment() {
        // Required empty public constructor
    }


    public static GuideFragment newInstance(int id) {
        GuideFragment fragment = new GuideFragment();
        //向fragment里传递数据
        Bundle args = new Bundle();
        args.putInt(Constant.ID, id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    protected View getLayoutView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guide, container, false);
    }

    @Override
    protected void initView() {
        super.initView();
        //找控件
        iv = findViewById(R.id.iv);
    }

    @Override
    protected void initDatum() {
        super.initDatum();
        //取出传递的数据
        int id = getArguments().getInt(Constant.ID, -1);
        if(id==-1) {
            getActivity().finish();
            return;
        }

        iv.setImageResource(id);
    }

}
