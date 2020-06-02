package com.sy.test.factory.simplefactory.pizzastore.order;

import com.sy.test.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;


    public OrderPizza(SimpleFactory simpleFactory) throws IOException {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) throws IOException {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

    private String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("pizza种类:");
        String str = strin.readLine();
        return str;
    }

}
