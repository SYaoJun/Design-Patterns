package com.bytedance.patterndesign.adapter.adapter1;

public class AdapterVoltage extends Voltage220v implements IVoltage5v {
    @Override
    public int output5v() {
        int src = output220v();
        int dest = src / 44;
        System.out.println("输出电压："+dest);
        return dest;
    }
}
