package com.sy.test.decorator;

//角色：具体装饰（ConcreteDecorator）：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
