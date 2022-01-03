package com.vlado.demo.db.service.autowired.demo.myinnerclass;

public class DemoInnerClass {


    public void someMethod() {
        System.out.println("SomeLogic");

        MyFileService.getFile();
//        ...
        MyFileService.writeFile();

    }

    static class MyFileService {
        public static void getFile() {
            System.out.println("Get some class");
        }

        public static void writeFile() {
            System.out.println("Write some class");
        }

    }
}


