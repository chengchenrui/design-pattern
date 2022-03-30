package com.ccr.designpattern.creational.factory.method;

public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Factory factory1 = new ConcreteFactory1();
        Factory factory2 = new ConcreteFactory2();
        factory.doSomething();
        factory1.doSomething();
        factory2.doSomething();
    }
}
