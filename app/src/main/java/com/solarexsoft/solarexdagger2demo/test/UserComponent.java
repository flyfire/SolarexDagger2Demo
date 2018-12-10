package com.solarexsoft.solarexdagger2demo.test;

import com.solarexsoft.solarexdagger2demo.MainActivity;
import com.solarexsoft.solarexdagger2demo.SecondActivity;

import dagger.Component;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 20:33/2018/12/6
 *    Desc:
 * </pre>
 */
@ActivityScope
@Component(modules = UserModule.class)
public interface UserComponent {
    void injectMainActivity(MainActivity activity);
    void injectSecondActivity(SecondActivity activity);
}
