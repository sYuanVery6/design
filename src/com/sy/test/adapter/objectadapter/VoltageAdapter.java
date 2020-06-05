package com.sy.test.adapter.objectadapter;


//适配器类
public class VoltageAdapter  implements IVoltage {
    public Voltage220V v;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {
        //获取到220v的电压
//        int srcV= v.output220V();
//        int dstV = srcV / 44;
//        return dstV;
        int dstV = 0;
        if(null == v){
            int src = v.output220V();
            System.out.println("使用对象适配器，进行适配");
            dstV = src/44;
            System.out.println("适配完成"+dstV);
        }
        return dstV;
    }
}
