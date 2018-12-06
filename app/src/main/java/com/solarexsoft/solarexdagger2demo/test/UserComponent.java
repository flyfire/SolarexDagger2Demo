package com.solarexsoft.solarexdagger2demo.test;

import com.solarexsoft.solarexdagger2demo.MainActivity;

import dagger.Component;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 20:33/2018/12/6
 *    Desc:
 * </pre>
 */
@Component(modules = UserModule.class)
public interface UserComponent {
    void injectMainActivity(MainActivity activity);
}
