package com.solarexsoft.solarexdagger2demo.test;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 22:25/2018/12/10
 *    Desc:
 * </pre>
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
