package com.bytedance.manager;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2();
        new Thread(()->{ for(int i = 0; i < 200; i++) ticket.sale(); }, "线程A").start();
        new Thread(()->{ for(int i = 0; i < 200; i++) ticket.sale(); }, "线程B").start();
        new Thread(()->{ for(int i = 0; i < 200; i++) ticket.sale(); }, "线程C").start();
    }
}

class Ticket2 {
    private int ticket = 50;
    Lock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try {
            if( ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(ticket--)+"张票，剩余票数为"+ticket);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

