package com.wmy.learning.mycloudmusic.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtil {
    private static  final String NAME = "my_cloud_music";

    private static final String SHOW_GUIDE = "SHOW_GUIDE";

    private static PreferenceUtil instance;

    private final Context context;

    private final SharedPreferences preference;

    public PreferenceUtil(Context context) {
        this.context = context.getApplicationContext();
        preference = this.context.getSharedPreferences(NAME,Context.MODE_PRIVATE);

    }

    public static PreferenceUtil getInstance(Context context) {
        if (instance == null) {
            instance = new PreferenceUtil(context);
        }
        return instance;

    }

    //判断是否显示引导界面
    public boolean isShowGuide () {
        return preference.getBoolean(SHOW_GUIDE,false);
    }

    //设置是否显示引导界面
    public void setIsShowGuide(boolean value) {
        preference.edit().putBoolean(SHOW_GUIDE,value).commit();
    }
}
