package com.bytedance.javabasic.manager;
//资源类：属性 方法
public class Ticket {
    private int ticket = 50;
    public synchronized void sale(){
        if( ticket > 0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(ticket--)+"张票，剩余票数为"+ticket);
        }
    }
}
