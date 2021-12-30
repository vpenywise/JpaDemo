package com.vlado.demo.service;

public class MyService {

    private SomeOtherService someOtherService;


    public void firstMethod() {
        System.out.println("First method");
        this.someOtherService = new SomeOtherService();
        someOtherService.secondMethod();
    }


}
