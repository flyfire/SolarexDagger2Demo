package com.solarexsoft.solarexdagger2demo.multimodule.modules;

import com.solarexsoft.solarexdagger2demo.test.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:04/2018/12/10
 *    Desc:
 * </pre>
 */
@Module
public class HttpModule {
    @ActivityScope
    @Provides
    public HttpObject provideHttp() {
        return new HttpObject();
    }
}
