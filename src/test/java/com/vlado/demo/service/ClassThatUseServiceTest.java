package com.vlado.demo.service;

import com.vlado.demo.service.demo.ClassThatUseService;
import org.junit.jupiter.api.Test;

class ClassThatUseServiceTest {

    @Test
    void methodThatUseMyService() {

        ClassThatUseService classThatUseService = new ClassThatUseService();
        classThatUseService.methodThatUseMyService();
    }
}