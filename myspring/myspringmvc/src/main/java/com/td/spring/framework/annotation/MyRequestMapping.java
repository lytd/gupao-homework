package com.td.spring.framework.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    String name() default "";

    String[] path() default {};

    RequestMethod[] method() default {};

}