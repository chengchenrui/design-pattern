package com.ccr.designpattern.creational.factory.method;

import com.ccr.designpattern.creational.factory.simple.Product;

public abstract class Factory {

    abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
        product.show();
    }
}
