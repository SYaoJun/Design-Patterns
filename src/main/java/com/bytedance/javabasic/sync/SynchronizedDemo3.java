package com.bytedance.javabasic.sync;

/**
 * @author yaojun
 * @create 2020-12-05 19:26
 * 对象锁1：使用synchronized(this)代码块
 */
public class SynchronizedDemo3 implements Runnable{
    static SynchronizedDemo3 instance1 = new SynchronizedDemo3();
    Object lock1 = new Object();
    Object lock2 = new Object();
    @Override
    public void run() {
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void method() throws InterruptedException {
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+"synchronized(this)类型,开始。");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"synchronized(this)类型,结束。");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance1);

        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){}

        System.out.println("finished");

    }
}
