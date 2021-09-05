package com.ly.mvc.framework.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LyRequestMapping {
    String value() default "";
}
