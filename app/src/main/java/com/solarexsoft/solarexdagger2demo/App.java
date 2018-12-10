package com.solarexsoft.solarexdagger2demo;

import android.app.Application;

import com.solarexsoft.solarexdagger2demo.multimodule.modules.AppComponent;
import com.solarexsoft.solarexdagger2demo.multimodule.modules.DaggerAppComponent;
import com.solarexsoft.solarexdagger2demo.multimodule.modules.DatabaseModule;
import com.solarexsoft.solarexdagger2demo.multimodule.modules.HttpModule;
import com.solarexsoft.solarexdagger2demo.multimodule.presenter.DaggerPresenterComponent;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:12/2018/12/10
 *    Desc:
 * </pre>
 */

public class App extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .databaseModule(new DatabaseModule())
                .httpModule(new HttpModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
