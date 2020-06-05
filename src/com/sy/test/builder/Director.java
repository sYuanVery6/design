package com.sy.test.builder;

/**
 * @author sYuan
 * 指挥者：调用建造者中的方法完成复杂对象的创建
 */
public class Director {

    private AbsBuilder absBuilder;

    public Director(AbsBuilder absBuilder) {
        this.absBuilder = absBuilder;
    }

    public Product construct(){
        absBuilder.buildPartA();
        absBuilder.buildPartB();
        absBuilder.buildPartC();
        return absBuilder.getResult();
    }
}
