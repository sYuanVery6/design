package com.sy.test.factory.simplefactory.pizzastore.order;

import com.sy.test.factory.simplefactory.pizza.CheessPizza;
import com.sy.test.factory.simplefactory.pizza.GreekPizza;
import com.sy.test.factory.simplefactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");

        if(orderType.equals("GreekPizza")){
            pizza = new GreekPizza();

        }else if(orderType.equals("CheessPizza")){
            pizza = new CheessPizza();
        }

        return pizza;
    }


}
