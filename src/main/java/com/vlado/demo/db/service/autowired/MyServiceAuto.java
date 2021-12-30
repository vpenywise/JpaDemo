package com.vlado.demo.db.service.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceAuto {

    @Autowired
    private SomeOtherServiceAuto someOtherService;


    public void firstMethod() {
        System.out.println("First method");
        someOtherService.secondMethod();
    }


}
