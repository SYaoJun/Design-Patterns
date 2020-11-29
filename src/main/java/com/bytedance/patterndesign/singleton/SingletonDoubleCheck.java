package com.bytedance.patterndesign.singleton;

/**
 * @author yaojun
 * @create 2020-11-29 10:28
 */
public class SingletonDoubleCheck {
    private SingletonDoubleCheck() {}
    private static volatile SingletonDoubleCheck instance;

    public static SingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (SingletonDoubleCheck.class){
                if(instance == null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}

class TestSingleton{
    public static void main(String[] args) {
        SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();
        System.out.println(instance == instance2);
    }
}
