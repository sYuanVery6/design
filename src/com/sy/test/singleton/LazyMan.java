package com.sy.test.singleton;

public class LazyMan {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton == lazySingleton1);
        System.out.println(lazySingleton.hashCode());

        System.out.println(lazySingleton1.hashCode());
    }
}
//实际开发中不推荐使用
class LazySingleton{
    private LazySingleton(){}

    private static LazySingleton lazySingleton;

    //保证类加载时 lazySingleton不会被初始化，只有调用静态方法时才会被初始化

    public static LazySingleton getInstance(){
        //线程不安全，多线程情况下，进入到if(lazySingleton == null)时，可能会产生多个实例
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}