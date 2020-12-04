package com.bytedance.patterndesign.principle.sr;

/**
 * @author yaojun
 * @create 2020-12-04 16:49
 * 在方法级别实现了单一职责，但是在类级别没有实现单一职责，因为类级别的单一职责往往成本较高。
 */
public class SR {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runRoad("摩托");
        vehicle.runWater("轮船");
        vehicle.runAerial("飞机");
    }
}

class Vehicle{
    void runRoad(String vehicle){
        System.out.println(vehicle+"跑在路上...");
    }
    void runWater(String vehicle){
        System.out.println(vehicle+"跑在水中...");
    }
    void runAerial(String vehicle){
        System.out.println(vehicle+"跑在空中...");
    }
}