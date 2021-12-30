package com.vlado.demo.service.demo;

import com.vlado.demo.service.MyService;

public class ClassThatUseService {

    private MyService myService;

    public void methodThatUseMyService() {
        this.myService = new MyService();
        myService.firstMethod();
    }
}
