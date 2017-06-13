package com.mi.xplog;

import android.app.Application;

import com.mi.utils.CCLog;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CCLog.debug(true);
    }
}
