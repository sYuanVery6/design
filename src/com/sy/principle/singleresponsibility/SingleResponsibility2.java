package com.sy.principle.singleresponsibility;

/**
 * @author sYuan
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

    }


}
class RoadVehicle{

    void run(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }

}
//遵守单一职责原则
//即将类分解，同时又修改客户端，改动很大

class AirVehicle{

    void run(String vehicle){
        System.out.println(vehicle + "在天上运行...");
    }

}
