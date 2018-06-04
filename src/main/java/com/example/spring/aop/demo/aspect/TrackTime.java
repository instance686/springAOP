package com.example.spring.aop.demo.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//intercepts only method
@Retention(RetentionPolicy.RUNTIME)//at runtime
public @interface TrackTime {
}
