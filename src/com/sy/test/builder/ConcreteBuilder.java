package com.sy.test.builder;


//具体建造者：实现了抽象建造者接口

/**
 * @author sYuan
 */
public class ConcreteBuilder extends AbsBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC");
    }
}
