package com.ccr.designpattern.behavioral.observer;

public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();
}
