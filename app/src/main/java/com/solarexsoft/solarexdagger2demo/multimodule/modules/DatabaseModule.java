package com.solarexsoft.solarexdagger2demo.multimodule.modules;

import com.solarexsoft.solarexdagger2demo.test.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:05/2018/12/10
 *    Desc:
 * </pre>
 */
@Module
public class DatabaseModule {
    @ActivityScope
    @Provides
    public DatabaseObject provideDatabase() {
        return new DatabaseObject();
    }
}
