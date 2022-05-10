package com.ccr.designpattern.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        Context context;
        context = new Context("A");
        context.doSomething();

        context = new Context("B");
        context.doSomething();

    }
}
