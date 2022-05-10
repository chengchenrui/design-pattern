package com.ccr.designpattern.behavioral.template;

public class Client {

    public static void main(String[] args) {
        AbstractClass concreteClass0 = new ConcreteClass();
        concreteClass0.templateMethod();

        AbstractClass concreteClass1 = new ConcreteClass1();
        concreteClass1.templateMethod();
    }
}
