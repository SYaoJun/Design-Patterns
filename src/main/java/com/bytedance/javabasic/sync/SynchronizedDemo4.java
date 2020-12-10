package com.bytedance.javabasic.sync;

/**
 * @author yaojun
 * @create 2020-12-05 19:28
 * 对象锁2：synchronized加在普通方法上
 */
public class SynchronizedDemo4 implements Runnable {
    static SynchronizedDemo4 instance1 = new SynchronizedDemo4();

    @Override
    public void run() {
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void method() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "synchronized加在普通方法上,开始。");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "synchronized加在普通方法上,结束。");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance1);

        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
        }

        System.out.println("finished");

    }
}
