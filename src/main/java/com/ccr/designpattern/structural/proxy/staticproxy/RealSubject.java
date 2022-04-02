package com.ccr.designpattern.structural.proxy.staticproxy;

public class RealSubject implements Subject {

    @Override
    public void doOperation() {
        System.out.println("RealSubject");
    }
}
