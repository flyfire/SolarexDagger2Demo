package com.solarexsoft.solarexdagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.solarexsoft.solarexdagger2demo.test.DaggerUserComponent;
import com.solarexsoft.solarexdagger2demo.test.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    User mUser1;
    @Inject
    User mUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.create().injectMainActivity(this);

        Log.d(TAG, mUser1.hashCode() + "");
        Log.d(TAG, mUser2.hashCode() + "");
    }

    public void click(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
