package com.solarexsoft.solarexdagger2demo.multimodule.presenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:07/2018/12/10
 *    Desc:
 * </pre>
 */
@Module
public class PresenterModule {
    @Singleton
    @Provides
    public PresenterObject providePresenter() {
        return new PresenterObject();
    }
}
