package com.bytedance.javabasic.juc;

/**
 * @author yaojun
 * @create 2020-12-05 19:39
 * 两个线程同时增加100000次，最终结果在加锁的情况的下为200000
 */
public class TwoThreadCount implements Runnable{
    static TwoThreadCount instance1 = new TwoThreadCount();
    static int number = 0;
    @Override
    public void run() {
        synchronized (this){
            for(int i = 0; i < 100000; i++){
                number++;
            }
        }
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance1);

        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){}

        System.out.println("finished: " + number);

    }
}
