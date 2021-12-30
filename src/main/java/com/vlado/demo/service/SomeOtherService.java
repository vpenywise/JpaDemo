package com.vlado.demo.service;

public class SomeOtherService {

    private AnotherInnerObject anotherInnerObject;

    public void secondMethod() {
        System.out.println("Second method");
        this.anotherInnerObject = new AnotherInnerObject();
        anotherInnerObject.innerMethod();

    }
}
