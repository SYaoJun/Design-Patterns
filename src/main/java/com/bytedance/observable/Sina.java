package com.bytedance.observable;

public class Sina implements Observer{
    private double temperature;
    private double pressure;
    private double humidity;
    @Override
    public void update(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("新浪页面温度 " + temperature);
        System.out.println("新浪页面气压 " + pressure);
        System.out.println("新浪页面湿度 " + humidity);
    }
}
