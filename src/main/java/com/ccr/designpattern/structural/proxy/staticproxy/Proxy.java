package com.ccr.designpattern.structural.proxy.staticproxy;

public class Proxy implements Subject {

    private final Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doOperation() {
        System.out.println("静态调用前");
        subject.doOperation();
        System.out.println("静态调用后");
    }
}
