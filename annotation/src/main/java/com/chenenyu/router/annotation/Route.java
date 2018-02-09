package com.chenenyu.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for route.
 * <p>
 * Created by chenenyu on 2016/12/20.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Route {
    /**
     * Route path.
     */
    String[] value();

    /**
     * The interceptors' name.
     */
    String[] interceptors() default {};
}
