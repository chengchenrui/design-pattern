package com.ccr.designpattern.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        // 被观察者
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //注册观察者
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        concreteSubject.setData("11111");
        concreteSubject.setData("22222");
    }
}
