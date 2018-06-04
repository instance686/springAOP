package com.example.spring.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect//combination of joinpoint and advice
@Configuration
public class AfterAspect {
    private Logger logger=LoggerFactory.getLogger(AfterAspect.class);

    @After(value = "execution(* com.example.spring.aop.demo.bussiness.*.*(..))")//pointcut
    public void afterThrowing(JoinPoint joinPoint){//specific interception of a method call
        //advice
            logger.info("after execution of {}",joinPoint);
    }

    //execution (* PACKAGE.*.*(..))
    //           |         | |
    // any returntype  class method
    //process of weaving AOP around methods is called Weaver and framework is weaving
    @AfterReturning(
            value = "execution(* com.example.spring.aop.demo.bussiness.*.*(..))",
            returning = "result"
        )//pointcut
    public void afterReturning(JoinPoint joinPoint,Object result){//specific interception of a method call
        //advice
        logger.info("{} returned with value {}",joinPoint,result);
    }

    @AfterThrowing(
            value = "execution(* com.example.spring.aop.demo.bussiness.*.*(..))",
            throwing = "exception"
    )//pointcut
    public void afterThrowing(JoinPoint joinPoint,Exception exception){//specific interception of a method call
        //advice
        logger.info("{} returned with value {}",joinPoint,exception);
    }

}
