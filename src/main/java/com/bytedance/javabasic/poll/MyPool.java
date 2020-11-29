package com.bytedance.javabasic.poll;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/*
* new ThreadPoolExecutor.AbortPolicy()); //银行满了，还有人进来，不处理这个人的，抛出异常 RejectedExecutionException
* new ThreadPoolExecutor.CallerRunsPolicy()); //哪儿来的去哪里 不会抛出异常 main线程执行的
* new ThreadPoolExecutor.DiscardPolicy()); //队列满了 丢掉任务 不会抛出异常
* new ThreadPoolExecutor.DiscardOldestPolicy()); //队列满了 尝试去和最早的线程竞争 不会抛出异常
* */
public class MyPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, //核心线程大小
                Runtime.getRuntime().availableProcessors(), //最大线程数 本机是4核
                3, //超时时间 超过这个设定时间都没有人调用 就会自动释放
                TimeUnit.SECONDS, //超时时间单位
                new LinkedBlockingDeque<>(3), //阻塞队列
                Executors.defaultThreadFactory(), //线程工厂 创建线程
                new ThreadPoolExecutor.DiscardOldestPolicy()); //队列满了 尝试去和最早的线程竞争 不会抛出异常

        try {
            // 最大承载数：最大线程数 + 阻塞队列容量 = 4 + 3 = 7 超过过7个以后，就开始拒绝
            for(int i = 1; i <= 8; i++){
                threadPoolExecutor.execute(()->{
                    System.out.println(Thread.currentThread().getName().toString()+" ok");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPoolExecutor.shutdown();
        }
    }
}
