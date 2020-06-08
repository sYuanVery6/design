package com.sy.test.decorator;


//角色：具体构件（concreyte component）:实现抽象构件，通过装饰角色为其添加一些职责

public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
