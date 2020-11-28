package com.bytedance.observable;



public interface Subject {
    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();
}
