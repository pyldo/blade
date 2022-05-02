package com.blade.annotation;

import com.blade.ioc.annotation.Bean;

import java.lang.annotation.*;

/**
 * WebHook url pattern
 *
 * @author <a href="mailto:hellokaton@gmail.com" target="_blank">hellokaton</a>
 * @since 2.0.6-Alpha1
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Bean
public @interface URLPattern {

    /**
     * @return URL patterns
     */
    String[] values() default {"/*"};

}