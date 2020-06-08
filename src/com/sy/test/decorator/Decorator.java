package com.sy.test.decorator;

//角色：抽象装饰（Decorator）：集成抽象构件，并包含具体构件的实例，可以通过其子类扩展具体的构件功能

public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //super.getPrice()是自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}
