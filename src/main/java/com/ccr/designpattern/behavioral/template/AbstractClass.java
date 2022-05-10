package com.ccr.designpattern.behavioral.template;

public abstract class AbstractClass {

    void primitiveOperationA() {
        System.out.println("step A");
    }

    void primitiveOperationB() {
        System.out.println("step B");
    }

    abstract void subOperationC();

    abstract void subOperationD();

    public void templateMethod() {
        this.primitiveOperationA();
        this.primitiveOperationB();
        this.subOperationC();
        this.subOperationD();
    }

}
