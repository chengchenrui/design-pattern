package com.ccr.designpattern.structural.adapter.classadapter;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("原方法");
    }
}
