package com.sy.test.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxyInstance = (Subject) new ProxyFactory(subject).newProxyInstance();
        proxyInstance.sayHello();
    }

}
