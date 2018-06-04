package com.example.spring.aop.demo.aspect;

import com.example.spring.aop.demo.DemoApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
    private Logger logger=LoggerFactory.getLogger(BeforeAspect.class);


    //execution (* PACKAGE.*.*(..))
    //           |         | |
    // any returntype  class method
    @Before("execution(* com.example.spring.aop.demo.bussiness.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Intercepted method calls {}",joinPoint);
    }

}
