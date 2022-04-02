package com.ccr.designpattern.structural.adapter.classadapter;

public class Client {

    public static void main(String[] args) {

        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target target = new Adapter();
        target.request();
    }
}
