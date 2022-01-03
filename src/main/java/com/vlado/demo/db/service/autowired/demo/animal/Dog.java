package com.vlado.demo.db.service.autowired.demo.animal;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Eat bones ");
    }
}
