package com.sy.test.builder;


//抽象建造者：包含创建产品各个子部件的抽象方法

public abstract class AbsBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
