package com.ccr.designpattern.creational.factory.abstractf;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.createProductA().show();
        factory1.createProductB().show();
        System.out.println("---------------------");
        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.createProductA().show();
        factory2.createProductB().show();
    }
}
