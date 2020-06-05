package com.sy.test.adapter.objectadapter;
//与类适配模式相比，适配器与被适配者的关系由类级别的集成关系，变成了对象的关联关系（聚合）

public class Client {


    public static void main(String[] args) {
        System.out.println("===类适配器模式===");

        Phone p = new Phone();
        p.charging(new VoltageAdapter(new Voltage220V()));
    }
}
