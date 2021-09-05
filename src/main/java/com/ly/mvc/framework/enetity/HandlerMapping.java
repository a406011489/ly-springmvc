package com.ly.mvc.framework.enetity;

import lombok.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Getter
@Setter
@ToString
public class HandlerMapping {

    /**
     * 接收请求的 Controller
     */
    private Object controller;

    /**
     * 处理请求的 Method
     */
    private Method method;

    /**
     * 请求的 url
     */
    private Pattern pattern;

    /**
     * 参数顺序。是为了进行参数绑定，key是参数名，value代表是第几个参数
     */
    private Map<String,Integer> paramIndexMapping = new HashMap<>();

}
