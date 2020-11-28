package com.bytedance.manager;



import java.sql.Time;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQ {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName().toString() + " put 1");
                queue.put("1");
                System.out.println(Thread.currentThread().getName().toString() + " put 2");
                queue.put("2");
                System.out.println(Thread.currentThread().getName().toString() + " put 3");
                queue.put("3");
            }catch (Exception e){
                e.printStackTrace();
            }
        }, "线程1").start();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName().toString() + " => "+ queue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName().toString() + " => "+ queue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName().toString() + " => "+ queue.take());
            }catch (Exception e){
                e.printStackTrace();
            }
        }, "线程2").start();
    }
}


