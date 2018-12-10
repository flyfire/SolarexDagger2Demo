package com.solarexsoft.solarexdagger2demo.multimodule.presenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:10/2018/12/10
 *    Desc:
 * </pre>
 */
@Singleton
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    public PresenterObject abcPresenter();
}
