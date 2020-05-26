package com.sy.principle.singleresponsibility;

/**
 * @author sYuan
 */
public class SingleResponsibility {


    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run(" 摩托车");

        vehicle.run(" 汽车");

        //根据交通工具的不同，运行方法也不同，违反了单一职责
        vehicle.run(" 飞机");
    }

}

class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }

}