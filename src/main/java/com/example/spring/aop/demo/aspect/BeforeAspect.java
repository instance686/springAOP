package com.example.spring.aop.demo.aspect;

import com.example.spring.aop.demo.DemoApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect//combination of joinpoint and advice
@Configuration
public class BeforeAspect {
    private Logger logger=LoggerFactory.getLogger(BeforeAspect.class);


    //execution (* PACKAGE.*.*(..))
    //           |         | |
    // any returntype  class method
    //process of weaving AOP around methods is called Weaver and framework is weaving
    @Before("com.example.spring.aop.demo.aspect.CommonJoinPointConfig.datalayerExecution()")//pointcut
    public void before(JoinPoint joinPoint){//specific interception of a method call
        //advice
        logger.info("Intercepted method calls {}",joinPoint);
    }

}
