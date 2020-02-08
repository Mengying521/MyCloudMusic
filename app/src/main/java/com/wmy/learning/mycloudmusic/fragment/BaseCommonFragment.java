package com.wmy.learning.mycloudmusic.fragment;

import android.content.Intent;
import com.wmy.learning.mycloudmusic.activity.BaseCommonActivity;
import com.wmy.learning.mycloudmusic.utils.PreferenceUtil;

public abstract class BaseCommonFragment extends BaseFragment {
    protected PreferenceUtil sp;

    @Override
    protected void initDatum() {
        super.initDatum();
        sp = PreferenceUtil.getInstance(getMainActivity());
    }

    protected void startActivity(Class<?> clazz) {
        startActivity(new Intent(getMainActivity(), clazz));

    }

    protected void startActivityAfterFinishThis(Class<?> clazz) {
        startActivity(new Intent(getMainActivity(), clazz));
        getMainActivity().finish();
    }

    public BaseCommonActivity getMainActivity() {
        return (BaseCommonActivity) getActivity();
    }
}
