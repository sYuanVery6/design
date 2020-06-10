package com.sy.test.observer.testdemo;

public class ConcreteSubject extends Subject {



    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("_________________");

        for(Object observer : observers){
            ((Observer)observer).response();
        }
    }
}
