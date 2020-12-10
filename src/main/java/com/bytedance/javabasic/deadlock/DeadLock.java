package com.bytedance.javabasic.deadlock;

import java.sql.Time;

/**
 * @author yaojun
 * @create 2020-12-10 11:52
 * 在一个A锁中调用另一个B锁
 * 同时在B锁中调用A锁
 */
public class DeadLock implements Runnable{
    public void setFlag(int flag) {
        this.flag = flag;
    }
    private static final Object o1 = new Object();
    private static final Object o2 = new Object();
    private int flag = 1;
    @Override
    public void run() {
        if(flag == 1){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"o1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"o2");
                }
            }
        }
        if(flag == 2){
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"o2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"o1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock();
        DeadLock deadLock2 = new DeadLock();

        deadLock1.setFlag(1);
        deadLock2.setFlag(2);

        new Thread(deadLock1,"thread1").start();
        new Thread(deadLock2,"thread2").start();
    }
}
