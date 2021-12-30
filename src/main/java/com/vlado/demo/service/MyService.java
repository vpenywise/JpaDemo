package com.vlado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class MyService {

    private SomeOtherService someOtherService;


    public void firstMethod() {
        System.out.println("First method");
        this.someOtherService = new SomeOtherService();
        someOtherService.secondMethod();
    }


}
