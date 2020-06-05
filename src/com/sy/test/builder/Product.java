package com.sy.test.builder;

/**
 * @author sYuan
 *
 * 产品角色：包含多个组成部件的复杂对象
 */
public class Product {
    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        System.out.println("PartA: "+ this.partA);
        System.out.println("PartB: "+ this.partB);
        System.out.println("PartC: "+ this.partC);
    }
}
