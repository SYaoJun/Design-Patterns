package com.bytedance.patterndesign.strategy;

/**
 * @author yaojun
 * @create 2020-12-03 16:51
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    public abstract void display();


    void quack(){
        System.out.println("鸭子嘎嘎叫");
    }
    void swim(){
        System.out.println("鸭子游泳");
    }
    void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
