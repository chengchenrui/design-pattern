package com.ccr.designpattern.creational.builder.v1;

public class ConcreteBuilder extends Builder {

    private final Product product = new Product();

    @Override
    void buildPartName() {
        product.setName("名称");
    }

    @Override
    void buildPartDetail() {
        product.setDetail("详情信息");
    }

    @Override
    Product getResult() {
        return product;
    }
}
