package com.vlado.demo.db.service.autowired.demo;

import com.vlado.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassThatUseServiceAuto {

    @Autowired
    private MyService myService;

    public void methodThatUseMyService() {
        myService.firstMethod();
    }
}
