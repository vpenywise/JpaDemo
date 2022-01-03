package com.vlado.demo.db.service.autowired.demo.animal;

public class DemouseInterface {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();


        someMethodAccpetAnimal(dog);
        someMethodAccpetAnimal(cat);
    }

    public static void someMethodAccpetAnimal(Animal animal) {
        animal.eat();
    }
}
