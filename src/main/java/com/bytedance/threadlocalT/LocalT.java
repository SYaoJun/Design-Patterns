package com.bytedance.threadlocalT;

import java.util.concurrent.TimeUnit;
/*线程隔离：线程A只能获取到线程A设置的变量*/
public class LocalT {
    private String content;
    ThreadLocal<String> tl = new ThreadLocal<>();
    public String getContent() {
       return tl.get();
    }

    public void setContent(String content) {
        tl.set(content);
    }

    public static void main(String[] args) {
        LocalT localT = new LocalT();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                localT.setContent(Thread.currentThread().getName()+"的数据");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"获取到"+localT.getContent());
            },String.valueOf(i+1)).start();
        }
    }
}
