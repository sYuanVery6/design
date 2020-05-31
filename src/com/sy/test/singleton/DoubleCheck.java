package com.sy.test.singleton;
//双重检查锁方式也属于懒汉式

public class DoubleCheck {
    public static void main(String[] args) {

        LazySingleton4 lazySingleton4 = LazySingleton4.getInstance();
        LazySingleton4 lazySingleton41 = LazySingleton4.getInstance();

        System.out.println(lazySingleton4 == lazySingleton41);

        System.out.println(lazySingleton4.hashCode());
        System.out.println(lazySingleton41.hashCode());

    }
}

class LazySingleton4{
    private LazySingleton4(){}

    private static LazySingleton4 lazySingleton4;

    //解决线程安全问题，也解决懒加载问题，同时保证效率，推荐。多线程情况下载第一个线程进入同步代码块后，获取到实例化对象。第二个线程在进入时在判断对象是否被实例化

    public static LazySingleton4 getInstance(){
        if(lazySingleton4 == null){
            synchronized (LazySingleton4.class){
                if (lazySingleton4 == null){
                    lazySingleton4 = new LazySingleton4();
                }
            }
        }
        return lazySingleton4;
    }
}