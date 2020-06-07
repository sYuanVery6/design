package com.sy.test.proxy.cglibproxy;

public class Client {

    public static void main(String[] args) {

        //创建目标对象
        RealSubject realSubject = new RealSubject();

        //创建代理对象，将目标对象传入
        RealSubject proxyInstance = (RealSubject)new ProxyFactory(realSubject).getProxyInstance();

        //指定代理对象的方法，触发interceptor方法，从而实现对目标对象的调用
        proxyInstance.sayHello();
    }

}
