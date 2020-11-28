package com.bytedance.observable;

public interface Observer {
    public void update(double temperature, double humidity, double pressure);
}
