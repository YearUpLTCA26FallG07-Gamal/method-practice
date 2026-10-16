package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
        //Call each method from main()


    }

    private static void sayGoodMorning() {
        System.out.println("GoodMornig");
    }

    private static void sayGoodbye() {
        System.out.println("Goodbye");
    }

    public static void sayHello() {
        System.out.println("Hello, World!");


    }
}