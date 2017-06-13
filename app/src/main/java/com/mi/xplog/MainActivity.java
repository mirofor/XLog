package com.mi.xplog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mi.xlog.CCLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CCLog.d("Test Log d");
        CCLog.e("Test Log e");
        CCLog.i("Test Log i");
        CCLog.v("Test Log v");
    }
}
