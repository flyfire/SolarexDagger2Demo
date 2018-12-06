package com.solarexsoft.solarexdagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solarexsoft.solarexdagger2demo.test.DaggerUserComponent;
import com.solarexsoft.solarexdagger2demo.test.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.create().injectMainActivity(this);

        Log.d(TAG, mUser.hashCode() + "");
    }
}
