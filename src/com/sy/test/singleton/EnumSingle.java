package com.sy.test.singleton;
//枚举类实现单例：线程安全，可以防止反序列化重新创建对象

public class EnumSingle {


    public static void main(String[] args) {
        SingletonE singletonE = SingletonE.INSTANCE;
        SingletonE singletonE1 = SingletonE.INSTANCE;

        System.out.println(singletonE == singletonE1);

        System.out.println(singletonE.hashCode());
        System.out.println(singletonE1.hashCode());
    }


}
enum SingletonE {
    /*
    返回实例
     */
    INSTANCE;
    public void sayOk(){
        System.out.println("ok~");
    }
}
