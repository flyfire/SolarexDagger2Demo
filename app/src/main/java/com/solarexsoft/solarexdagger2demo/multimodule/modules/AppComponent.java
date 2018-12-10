package com.solarexsoft.solarexdagger2demo.multimodule.modules;

import com.solarexsoft.solarexdagger2demo.ThirdActivity;
import com.solarexsoft.solarexdagger2demo.multimodule.presenter.PresenterComponent;
import com.solarexsoft.solarexdagger2demo.test.ActivityScope;

import dagger.Component;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:08/2018/12/10
 *    Desc:
 * </pre>
 */
@ActivityScope
@Component(modules = {HttpModule.class, DatabaseModule.class}, dependencies = {PresenterComponent.class})
public interface AppComponent {
    public void injectThirdActivity(ThirdActivity activity);
}
