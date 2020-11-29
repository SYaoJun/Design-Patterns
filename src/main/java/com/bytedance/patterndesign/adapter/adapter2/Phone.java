package com.bytedance.patterndesign.adapter.adapter2;

public class Phone {
    public void charging(IVoltage5v iVoltage5v){

        if( iVoltage5v.output5v() == 5){
            System.out.println("电压为5v,可以充电！");
        }else{
            System.out.println("电压不是5v,不能充电！");
        }
    }
}
