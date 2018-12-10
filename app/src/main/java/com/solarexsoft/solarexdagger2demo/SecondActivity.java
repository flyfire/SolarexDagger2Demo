package com.solarexsoft.solarexdagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.solarexsoft.solarexdagger2demo.test.DaggerUserComponent;
import com.solarexsoft.solarexdagger2demo.test.User;

import javax.inject.Inject;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 22:25/2018/12/10
 *    Desc:
 * </pre>
 */

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.getSimpleName();

    @Inject
    User user1;
    @Inject
    User user2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DaggerUserComponent.create().injectSecondActivity(this);

        Log.d(TAG, "user1 = " + user1.hashCode());
        Log.d(TAG, "user2 = " + user2.hashCode());
    }

    public void click(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
