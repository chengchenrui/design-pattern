package com.ccr.designpattern.structural.adapter.objectadapter;

/**
 * 适配器
 */
public class Adapter extends Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
