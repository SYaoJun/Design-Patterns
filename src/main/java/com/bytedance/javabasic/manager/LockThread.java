package com.bytedance.javabasic.manager;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread {
    public static void main(String[] args) {
        Data2 data = new Data2();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++)data.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程A").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++)data.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程B").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++)data.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程C").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++)data.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程D").start();
    }
}

class Data2 {
    private int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    //+1
    void increment() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + " " + number);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //-1
    void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + " " + number);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
