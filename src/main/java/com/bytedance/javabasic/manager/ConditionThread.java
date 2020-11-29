package com.bytedance.javabasic.manager;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionThread {
    public static void main(String[] args) {
        Data3 data = new Data3();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) data.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "线程A").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) data.printB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "线程B").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) data.printC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "线程C").start();
    }
}

class Data3 {
    private int number = 1;
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    //+1
    void printA() throws InterruptedException {
        lock.lock();
        try {
            while (number != 1) {
                condition1.await();
            }
            number = 2;
            System.out.println(Thread.currentThread().getName() + " AAA " + number);
            condition2.signal(); //精准通知线程2
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //-1
    void printB() throws InterruptedException {
        lock.lock();
        try {
            while (number != 2) {
                condition2.await();
            }
            number = 3;
            System.out.println(Thread.currentThread().getName() + " BBB " + number);
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printC() throws InterruptedException {
        lock.lock();
        try {
            while (number != 3) {
                condition3.await();
            }
            number = 1;
            System.out.println(Thread.currentThread().getName() + " CCC " + number);
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}