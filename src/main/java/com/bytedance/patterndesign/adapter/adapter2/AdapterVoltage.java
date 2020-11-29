package com.bytedance.patterndesign.adapter.adapter2;


public class AdapterVoltage implements IVoltage5v {
    private Voltage220v voltage220v;
    //通过构造器传入
    public AdapterVoltage(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        int dest = 0;
        if(null != voltage220v){
            int src = voltage220v.output220v();
            dest = src / 44;
            System.out.println("输出电压：" + dest);
        }
        return dest;
    }
}
