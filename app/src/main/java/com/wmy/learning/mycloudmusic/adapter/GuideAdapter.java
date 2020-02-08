package com.wmy.learning.mycloudmusic.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.wmy.learning.mycloudmusic.R;
import com.wmy.learning.mycloudmusic.fragment.GuideFragment;

import java.util.ArrayList;
import java.util.List;

public class GuideAdapter extends BaseFragmentPagerAdapter<Integer> {

    private List<Integer> datum = new ArrayList<>();

    public GuideAdapter(Context context, FragmentManager fm) {
        super(context,fm);
    }


    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(getData(position));
    }
}
