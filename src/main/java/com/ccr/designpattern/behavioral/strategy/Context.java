package com.ccr.designpattern.behavioral.strategy;

public class Context {
    private Strategy strategy;

    public Context(String flag) {
        switch (flag) {
            case "A":
                strategy = new ConcreteStrategyA();
                break;
            case "B":
                strategy = new ConcreteStrategyB();
                break;
            default:
                
        }
    }

    void doSomething() {
        strategy.behavior();
    }
}