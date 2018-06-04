package com.example.spring.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect//combination of joinpoint and advice
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger=LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

    @Around("execution(* com.example.spring.aop.demo.bussiness.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime=System.currentTimeMillis();
        joinPoint.proceed();
        Long timetaken=System.currentTimeMillis()-startTime;
        logger.info("Time taken by {} is {} ",joinPoint,timetaken);
    }



}
