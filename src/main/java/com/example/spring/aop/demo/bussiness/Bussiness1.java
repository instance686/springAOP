package com.example.spring.aop.demo.bussiness;


import com.example.spring.aop.demo.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bussiness1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        return dao1.retrieveSomething();
    }

}
