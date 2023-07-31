package com.springcore.ResourceAndInject;

import jakarta.inject.Qualifier;

import java.lang.annotation.*;

@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DatePrefixAnnotation {
}
