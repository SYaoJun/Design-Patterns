package com.bytedance.javabasic.sync;

/**
 * @author yaojun
 * @create 2020-12-05 18:42
 * 类锁1：使用synchronized(*.class)代码块
 * 普通方法可以调用静态方法，但是静态方法只能调用静态方法。
 */
public class SynchronizedDemo1 implements Runnable{
    static SynchronizedDemo1 instance1 = new SynchronizedDemo1();
    static SynchronizedDemo1 instance2 = new SynchronizedDemo1();
    @Override
    public void run() {
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void method() throws InterruptedException {
        synchronized (SynchronizedDemo1.class){
            System.out.println(Thread.currentThread().getName()+"synchronized(*.class)类型,开始。");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"synchronized(*.class)类型,结束。");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){}

        System.out.println("finished");

    }
}
