package com.ly.mvc.framework.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LyAutowired {
    String value() default "";
}
