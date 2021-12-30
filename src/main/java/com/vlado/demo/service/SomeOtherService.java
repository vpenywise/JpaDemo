package com.vlado.demo.service;

public class SomeOtherService {

    private AnotherInnerObject anotherInnerObject;

    public void secondMethod() {
        System.out.println("Second method");
        anotherInnerObject.innerMethod();

    }
}
