package com.ccr.designpattern.structural.adapter.objectadapter;


public class ConcreteTarget extends Target {

    @Override
    public void request() {
        System.out.println("原方法");
    }
}
