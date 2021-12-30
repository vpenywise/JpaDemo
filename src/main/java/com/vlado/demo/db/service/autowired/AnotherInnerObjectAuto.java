package com.vlado.demo.db.service.autowired;

import org.springframework.stereotype.Service;

@Service
public class AnotherInnerObjectAuto {

    public void innerMethod() {
        System.out.println("Inner method");
    }
}
