package com.ccr.designpattern.creational.factory.simple;

public class ConcreteProduct implements Product {
    @Override
    public void show() {
        System.out.println("生产出产品 A");
    }
}
