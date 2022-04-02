package com.ccr.designpattern.creational.builder.v1;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Product product = builder.getResult();
        System.out.println(product);
    }
}
