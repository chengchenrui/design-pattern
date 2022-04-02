package com.ccr.designpattern.creational.builder.v1;

public abstract class Builder {

    abstract void buildPartName();

    abstract void buildPartDetail();

    abstract Product getResult();
}
