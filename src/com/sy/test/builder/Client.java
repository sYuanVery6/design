package com.sy.test.builder;

/**
 * @author sYuan
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        AbsBuilder absBuilder = new ConcreteBuilder();

        Director director = new Director(absBuilder);

        Product product = director.construct();

        product.show();
    }
}

/*
场景举例：装修房子
我们将房子抽象成一个对象（Product）,它包含了墙体装修，地面装修，和家具选择三个具体属性
当我们要装修房子时（new 一个Product对象），需要找到装修队来对Product的具体属性来进行构建
当装修队开始装修房子时，他们的装修方案扮演着ABSBuilder的角色，而装修工人扮演着ConcreteBuilder按照装修方案（ABSBuilder）对Product对象的具体属性进行实现
装修队长则扮演着指挥者（Director）的角色指挥装修工人（ConcreteBuilder）进行细节实现
要装修房子的主人则扮演着Client的角色

 */
