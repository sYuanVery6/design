package com.sy.test.singleton;

public class Hunger {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1 == singleton2);
    }

}
/*
*  饿汉式（静态常量）单例模式，定义一个静态实例，在加载类的时候初始化
*  1. 写法简单，类加载时被实例化，避免线程同步
*  2. 不能达到lazy loading的效果，如果类加载之后一直未用，会造成内存浪费
* */

class Singleton{

    private Singleton(){}

    private final static Singleton instacce = new Singleton();

    public static Singleton getInstance(){
        return instacce;
    }
}
