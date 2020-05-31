package com.sy.test.singleton;



/**
 * @author sYuan
 * 饿汉式的另一种实现方式，将单例对象在静态方法块中实例化
 * 实例化后，不使用会一直占用内存
 */
public class Hunger2 {

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
class Singleton2{
    private Singleton2(){}

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}