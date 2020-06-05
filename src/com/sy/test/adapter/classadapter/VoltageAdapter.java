package com.sy.test.adapter.classadapter;


//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage{

    @Override
    public int output5V() {
        //获取到220v的电压
        int srcV= output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
