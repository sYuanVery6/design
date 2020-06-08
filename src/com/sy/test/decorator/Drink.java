package com.sy.test.decorator;

//角色：抽象构件（component）：定义一个抽象接口以规范准备收附加责任的对象

public abstract class Drink {

    public String des;//描述

    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法，被子类实现
    public abstract float cost();

}
