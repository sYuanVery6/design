package com.sy.test.proxy.dynamic;

public class RealSubject implements Subject {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
