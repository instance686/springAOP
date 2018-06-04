package com.example.spring.aop.demo.bussiness;


import com.example.spring.aop.demo.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bussiness2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        return dao2.retrieveSomething();
    }

}
