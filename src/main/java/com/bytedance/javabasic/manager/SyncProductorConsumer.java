package com.bytedance.javabasic.manager;

public class SyncProductorConsumer {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++) {
                    data.increment();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程A").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++) {
                    data.decrement();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程B").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++) {
                    data.increment();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程C").start();
        new Thread(()->{
            try {
                for(int i = 0; i < 100; i++) {
                    data.decrement();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程D").start();
    }
}
class Data{
    private int number = 0;
    //+1
    synchronized void increment() throws InterruptedException {
        while(number!=0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+" "+number);
        this.notifyAll();
    }
    //-1
    synchronized void decrement() throws InterruptedException {
        while(number==0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+" "+number);
        this.notifyAll();
    }
}
