package com.sy.test.observer.testdemo;

import java.util.ArrayList;
import java.util.List;

//抽象目标
public abstract class Subject {

    public List<Observer> observers = new ArrayList<>();

    //增加观察者方法
    public void add(Observer observer){
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }

    //通知观察者方法
    public abstract void notifyObserver();

}
