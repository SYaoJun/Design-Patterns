package com.bytedance.patterndesign.observer;

import java.util.ArrayList;

public class Weather implements Subject{
    private double temperature;
    private double pressure;
    private double humidity;
    private ArrayList<Observer> observers;
    public void setData(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public Weather() {
       observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observers){
            ob.update(temperature, humidity, pressure);
        }
    }

}
