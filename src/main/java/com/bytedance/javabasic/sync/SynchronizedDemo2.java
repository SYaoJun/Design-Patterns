package com.bytedance.javabasic.sync;

/**
 * @author yaojun
 * @create 2020-12-05 19:20
 * 类锁2：把synchronized关键字加到静态方法上
 */
public class SynchronizedDemo2 implements Runnable {
    static SynchronizedDemo2 instance1 = new SynchronizedDemo2();
    static SynchronizedDemo2 instance2 = new SynchronizedDemo2();

    @Override
    public void run() {
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized static void method() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "synchronized加在static方法上,开始。");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "synchronized加在static方法上,结束。");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
        }

        System.out.println("finished");

    }
}
