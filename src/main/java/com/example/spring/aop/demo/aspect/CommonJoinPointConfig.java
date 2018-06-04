package com.example.spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.example.spring.aop.demo.bussiness.*.*(..))")
    public void datalayerExecution(){}
}
