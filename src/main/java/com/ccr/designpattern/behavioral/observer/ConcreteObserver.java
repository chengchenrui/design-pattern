package com.ccr.designpattern.behavioral.observer;

public class ConcreteObserver implements IObserver {

    public ConcreteObserver(ISubject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String data) {
        System.out.println("观察者收到更新数据为：" + data);
    }
}
