package com.brz.talib.core.meta.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface OptInputParameterInfo {
    String      paramName();
    String      displayName();
    int         flags();    // bitwise OR of OputInputFlags

    OptInputParameterType type();
    Class<? extends Object> dataSet();
}
