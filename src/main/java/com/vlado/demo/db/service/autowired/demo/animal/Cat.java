package com.vlado.demo.db.service.autowired.demo.animal;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Eat fish");
    }
}
