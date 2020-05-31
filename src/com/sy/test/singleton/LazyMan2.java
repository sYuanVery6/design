package com.sy.test.singleton;
//懒汉式2 线程安全
public class LazyMan2 {
    public static void main(String[] args) {
        LazySingleton2 lazySingleton2 = LazySingleton2.getInstance();
        LazySingleton2 lazySingleton21 = LazySingleton2.getInstance();
        System.out.println(lazySingleton2 == lazySingleton21);

        System.out.println(lazySingleton2.hashCode());
        System.out.println(lazySingleton21.hashCode());
    }
}

class LazySingleton2{
    private LazySingleton2(){}

    private static LazySingleton2 lazySingleton2;

    //用synchronized修饰获取实例的方法，线程安全，但是多线程情况下，每次只能有一个线程获取到实例之后，下一个线程才能获取，效率太低。不推荐
    public static synchronized LazySingleton2 getInstance(){
        if(lazySingleton2 == null){

                lazySingleton2 = new LazySingleton2();

        }
        return lazySingleton2;
    }
}
