package com.ccr.designpattern.structural.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
