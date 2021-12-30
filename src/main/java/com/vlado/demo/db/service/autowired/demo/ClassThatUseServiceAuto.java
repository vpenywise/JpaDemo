package com.vlado.demo.db.service.autowired.demo;

import com.vlado.demo.db.service.autowired.MyServiceAuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassThatUseServiceAuto {

    @Autowired
    private MyServiceAuto myServiceAuto;

    public void methodThatUseMyService() {
        myServiceAuto.firstMethod();
    }
}
