package com.solarexsoft.solarexdagger2demo.test;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 20:33/2018/12/6
 *    Desc:
 * </pre>
 */
@Module
public class UserModule {
    @ActivityScope
    @Provides
    public User provideUser() {
        return new User();
    }
}
