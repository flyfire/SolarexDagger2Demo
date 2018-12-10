package com.solarexsoft.solarexdagger2demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.solarexsoft.solarexdagger2demo.multimodule.modules.DatabaseObject;
import com.solarexsoft.solarexdagger2demo.multimodule.modules.HttpObject;
import com.solarexsoft.solarexdagger2demo.multimodule.presenter.PresenterObject;

import javax.inject.Inject;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:12/2018/12/10
 *    Desc:
 * </pre>
 */

public class ThirdActivity extends AppCompatActivity {
    private static final String TAG = ThirdActivity.class.getSimpleName();

    @Inject
    HttpObject httpObject;
    @Inject
    DatabaseObject databaseObject;
    @Inject
    PresenterObject presenterObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App)getApplication()).getAppComponent().injectThirdActivity(this);
        Log.d(TAG, "httpObject = " + httpObject);
        Log.d(TAG, "databaseObject = " + databaseObject);
        Log.d(TAG, "presenterObject = " + presenterObject);
    }
}
