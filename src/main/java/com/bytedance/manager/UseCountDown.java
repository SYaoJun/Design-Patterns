package com.bytedance.manager;

import java.util.concurrent.CountDownLatch;

public class UseCountDown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName().toString());
            }, String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println("close door");
    }
}
