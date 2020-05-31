package com.sy.test.singleton;

public class LazyMan3 {

    public static void main(String[] args) {

        LazySingleton3 lazySingleton3 = LazySingleton3.getInstance();
        LazySingleton3 lazySingleton31 = LazySingleton3.getInstance();

        System.out.println(lazySingleton3 == lazySingleton31);

        System.out.println(lazySingleton3.hashCode());
        System.out.println(lazySingleton31.hashCode());

    }
}

class LazySingleton3{
    private LazySingleton3(){}

    private static LazySingleton3 lazySingleton3;

    //不推荐
    public static LazySingleton3 getInstance(){
        if(lazySingleton3 == null){
            synchronized (LazySingleton3.class){
                lazySingleton3 = new LazySingleton3();
            }
        }
        return lazySingleton3;
    }

}
