package com.bytedance.javabasic.poll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        //Executors工具类 3大方法
        ExecutorService executorService = Executors.newSingleThreadExecutor(); //单线程
        ExecutorService executorService1 = Executors.newFixedThreadPool(5); //固定线程
        ExecutorService executorService2 = Executors.newCachedThreadPool(); //可伸缩
        try {
            for(int i = 0; i < 10; i++){
                executorService2.execute(()->{
                    System.out.println(Thread.currentThread().getName().toString()+" ok");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
            executorService1.shutdown();
            executorService2.shutdown();
        }
    }
}
