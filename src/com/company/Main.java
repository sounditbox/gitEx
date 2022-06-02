package com.company;

public class Main {

    public static void main(String[] args) {
        Greeter.greet();
        Greeter.greet("Ruslan");
        System.out.println("How are you?!");
        Counter c = new Counter();
        System.out.println(++c.count);
    }
}
