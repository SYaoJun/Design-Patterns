package com.bytedance.javabasic.manager;



import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreT {
    //用在限流 抢车位
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3); //3个可用的位置
        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire(); //获取
                    System.out.println(Thread.currentThread().getName().toString()+"获得");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName().toString()+"释放");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
