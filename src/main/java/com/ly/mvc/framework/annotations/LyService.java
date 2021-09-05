package com.ly.mvc.framework.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LyService {
    String value() default "";
}
