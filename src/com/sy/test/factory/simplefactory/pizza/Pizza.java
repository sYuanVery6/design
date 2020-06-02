package com.sy.test.factory.simplefactory.pizza;

public class Pizza {

    private String pizzaType;


    public void prepare(){
        System.out.println("获得原材料"+this.pizzaType);
    }

    public void bake(){
        System.out.println("制作披萨"+this.pizzaType);
    }

    public void cut(){
        System.out.println("切披萨"+this.pizzaType);
    }

    public void box(){
        System.out.println("打包披萨"+this.pizzaType);
    }


    public void setPizzaType(String pizzaType){
        this.pizzaType = pizzaType;
    }
}
