package com.ccr.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {

    private final List<IObserver> observers;

    private String data;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    public void setData(String data) {
        this.data = data;
        notifyObserver();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (IObserver iObserver : observers) {
            iObserver.update(data);
        }
    }
}
