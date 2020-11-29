package com.bytedance.patterndesign.factory.simplefactory;

/**
 * @author yaojun
 * @create 2020-11-29 14:05
 */
public class CarFactory {

    public static Car getCar(String car){
        if(car.equals("五菱")){
            return new Wuling();
        }else if(car.equals("大众")){
            return new DaZhong();
        }else{
            return null;
        }

    }
}
