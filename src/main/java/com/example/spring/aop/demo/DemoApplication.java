package com.example.spring.aop.demo;

import com.example.spring.aop.demo.bussiness.Bussiness1;
import com.example.spring.aop.demo.bussiness.Bussiness2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Logger logger=LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private Bussiness1 bussiness1;

    @Autowired
    private Bussiness2 bussiness2;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("{}",bussiness1.calculateSomething());
        logger.info("{}",bussiness2.calculateSomething());

    }
}
