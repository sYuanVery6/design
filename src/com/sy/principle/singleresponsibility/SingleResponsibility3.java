package com.sy.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");

        vehicle2.runAir("飞机");

        vehicle2.runWater("轮船");

    }

}


//在原来的类上增加方法，在类的级别上没有遵守单一职责，但是方法级别上遵守了单一职责原则

class Vehicle2{

    void run(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }

    void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行...");
    }

    void runWater(String vehicle){
        System.out.println(vehicle + "在水里上运行...");
    }

}
