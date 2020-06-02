package com.sy.test.factory.simplefactory.pizzastore.order;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
