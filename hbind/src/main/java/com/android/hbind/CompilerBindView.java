package com.android.hbind;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Created by huangbei on 20-1-15.
 */

@Retention(RetentionPolicy.CLASS)//编译时生效
@Target({ElementType.FIELD,ElementType.TYPE})//描述变量和类
public @interface CompilerBindView {
    int value() default -1;
}
