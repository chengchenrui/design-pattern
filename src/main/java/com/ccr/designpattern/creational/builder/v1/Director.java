package com.ccr.designpattern.creational.builder.v1;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartName();
        builder.buildPartDetail();
    }
}
