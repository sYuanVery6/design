package com.sy.test.adapter.classadapter;

/**
 * @author sYuan
 * 220v电压：被适配的类
 */
public class Voltage220V {


    //输出220v电压
    public int output220V(){
        int src = 220;
        System.out.println("电压="+src+"V");
        return src;
    }

}
