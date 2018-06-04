package com.example.spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.example.spring.aop.demo.dao.*.*(..))")
    public void datalayerExecution(){}

    @Pointcut("execution(* com.example.spring.aop.demo.bussiness.*.*(..))")
    public void bussinesslayerExecution(){}


    @Pointcut("com.example.spring.aop.demo.aspect.CommonJoinPointConfig.datalayerExecution() && com.example.spring.aop.demo.aspect.CommonJoinPointConfig.bussinesslayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(Dao*)")
    public void beanStartingWithDao(){}

    @Pointcut("bean(*dao*)")
    public void beanContaining(){}

    @Pointcut("within(com.example.spring.aop.demo.dao..*)")
    public void datalayerExecutionWithWithin(){}

    @Pointcut("@annotation(com.example.spring.aop.demo.aspect.TrackTime) ")
    public void trackTimeAnnotation(){}
}
