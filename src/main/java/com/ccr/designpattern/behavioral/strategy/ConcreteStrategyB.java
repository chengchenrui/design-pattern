package com.ccr.designpattern.behavioral.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void behavior() {
        System.out.println("策略-B");
    }
}
