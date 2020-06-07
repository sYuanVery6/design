package com.sy.test.proxy.cglibproxy;

public class RealSubject {


    public void sayHello(){

        System.out.println("Hello World.--cglib代理  不需要实现接口");

    }

}
