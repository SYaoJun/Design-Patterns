package com.bytedance.javabasic.manager;

import java.util.concurrent.TimeUnit;

public class VolatileT {
    public volatile static int number = 0; //验证 volatile保证内存的可见性
    public static void main(String[] args) throws Exception {
        new Thread(()->{
            while(number == 0){

            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        number = 1;
        System.out.println(number);

    }
}
