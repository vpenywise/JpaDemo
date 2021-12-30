package com.vlado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class SomeOtherService {

    private AnotherInnerObject anotherInnerObject;


//Ако искаш да видиш как се чупи
//    public SomeOtherService(AnotherInnerObject anotherInnerObject) {
//        this.anotherInnerObject = anotherInnerObject;
//    }

    public void secondMethod() {
        System.out.println("Second method");
        this.anotherInnerObject = new AnotherInnerObject();
        anotherInnerObject.innerMethod();

    }
}
