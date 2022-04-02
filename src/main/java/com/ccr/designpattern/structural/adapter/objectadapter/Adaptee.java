package com.ccr.designpattern.structural.adapter.objectadapter;

/**
 * 需要适配的类
 */
public class Adaptee {

    void specificRequest() {
        System.out.println("被适配的方法");
    }

}
