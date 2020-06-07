package com.sy.test.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
jar包版本：
asm-4.1.jar
asm-commons -7.3.jar
asm-tree-4.1.jar
cglib-3.3.0.jar
 */


public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public void preProxy(){
        System.out.println("before sayHello");
    }

    public void postProxy(){
        System.out.println("after sayHello");
    }

    public Object newProxyInstance(){
        /*
        1.得到目标类的类加载器和实现的接口
        2.事件处理会根据目标对象和目标对象要执行的方法及参数进行处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        preProxy();
                        //执行目标对象的方法,并接受方法返回的结果
                        Object invokeMethod = method.invoke(target,args);
                        postProxy();
                        return invokeMethod;
                    }
                });

    }

}
