package com.vlado.demo.db.service.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeOtherServiceAuto {

    @Autowired
    private AnotherInnerObjectAuto anotherInnerObject;


    public SomeOtherServiceAuto(AnotherInnerObjectAuto anotherInnerObject) {
        this.anotherInnerObject = anotherInnerObject;
    }

    public void secondMethod() {
        System.out.println("Second method");
        anotherInnerObject.innerMethod();

    }
}
