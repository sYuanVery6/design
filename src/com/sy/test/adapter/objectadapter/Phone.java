package com.sy.test.adapter.objectadapter;

/**
 * @author sYuan
 */
public class Phone {


    //充电
    public void charging(IVoltage iVoltage){
        if (iVoltage.output5V() == 5){
            System.out.println("电压为5v,可以充电");
        }else{
            System.out.println("电压大于5v，无法充电");
        }
    }

}
