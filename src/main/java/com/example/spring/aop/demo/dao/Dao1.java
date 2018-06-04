package com.example.spring.aop.demo.dao;


import com.example.spring.aop.demo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {


    @TrackTime
    public String retrieveSomething(){
            return "Dao1";
    }
}
