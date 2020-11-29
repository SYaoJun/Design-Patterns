package com.bytedance.patterndesign.observer;

public interface Observer {
    public void update(double temperature, double humidity, double pressure);
}
