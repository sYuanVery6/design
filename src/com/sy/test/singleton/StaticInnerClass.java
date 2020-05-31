package com.sy.test.singleton;

//静态内部类：属于懒汉式，线程安全，懒加载，效率高推荐使用

public class StaticInnerClass {



    public static void main(String[] args) {
        OutterSingleton outterSingleton = OutterSingleton.getInstance();
        OutterSingleton outterSingleton1 = OutterSingleton.getInstance();

        System.out.println(outterSingleton == outterSingleton1);

        System.out.println(outterSingleton.hashCode());
        System.out.println(outterSingleton1.hashCode());
    }

}
class OutterSingleton{

    private OutterSingleton(){}



    //利用类的初始化机制保证初始化实例时只有一个线程
    //静态内部类在外部类初始化时，不会被实例化，只有调用getInstance时，才会被实例化
    //类的静态属性只会在类第一次加载时初始化，在类进行初始化时，别的线程是无法进来的，所以jvm帮我们保证了线程的安全性
    private static class InnerSingleton{
        private final static OutterSingleton outterSingleton = new OutterSingleton();
    }

    public static synchronized OutterSingleton getInstance(){
        return InnerSingleton.outterSingleton;
    }

}
