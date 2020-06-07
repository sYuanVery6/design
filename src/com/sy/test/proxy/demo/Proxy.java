package com.sy.test.proxy.demo;

//角色：代理类
//与真实主题实现相同的接口，在勒种声明真实主题。可对真实主题实现的功能进行拓展、控制金额访问。

public class Proxy implements Subject {

    RealSubject realSubject = new RealSubject();

    @Override
    public void sayHello() {
        preSayHello();
        realSubject.sayHello();
        postSayHello();

    }


    public void preSayHello(){
        System.out.println("before SayHello Running");
    }

    public void postSayHello(){
        System.out.println("after SayHello Running");
    }
}
