package com.bytedance.manager;


public class SaleTicket {
    public static void main(String[] args) {
        //把资源类放入到线程的接口中
        Ticket ticket = new Ticket();
        new Thread(()->{
            for(int i = 0; i < 200; i++) ticket.sale();
        }, "线程A").start();
        new Thread(()->{
            for(int i = 0; i < 200; i++) ticket.sale();
        }, "线程B").start();
        new Thread(()->{
            for(int i = 0; i < 200; i++) ticket.sale();
        }, "线程C").start();
    }

}


