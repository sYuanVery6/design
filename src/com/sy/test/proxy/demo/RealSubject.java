package com.sy.test.proxy.demo;


//角色：真实主题
//实现类抽象主题的具体方法，是代理对象所代理的真实对象，是最终引用的对象


public class RealSubject implements Subject {
    @Override
    public void sayHello() {
        System.out.println("RealProxy:Hello World!");
    }
}
