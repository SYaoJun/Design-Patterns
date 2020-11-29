package com.bytedance.patterndesign.observer;

public class Client {
    public static void main(String[] args) {

        //创建一个具体主题类
        Weather weather = new Weather();
        //创建一个具体观察者
        Observer observer = new Baidu() ;
        //注册到主题中
        weather.registerObserver(observer);
        //测试数据
        System.out.println("通知各个注册的用户");
        weather.setData(10.2d, 11.3d, 44.6d);
        System.out.println("=====================================");

        //再创建一个具体观察者
        Observer observer1 = new Sina();
        //注册到主题中
        weather.registerObserver(observer1);
        //重新设置
        weather.setData(100.5,20.3,33.2);
        System.out.println("=====================================");

        //移除一个观察者
        weather.deleteObserver(observer);
        weather.setData(11,22,44);
        System.out.println("=====================================");
    }
}
