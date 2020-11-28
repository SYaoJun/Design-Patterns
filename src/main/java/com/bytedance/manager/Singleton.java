package com.bytedance.manager;



public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}

    public Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
}
