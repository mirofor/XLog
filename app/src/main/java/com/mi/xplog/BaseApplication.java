package com.mi.xplog;

import android.app.Application;

import com.mi.xlog.CCLog;

/**
 * Created by xiaomi on 2017/6/13.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CCLog.debug(true);
    }
}
