package com.ccr.designpattern.creational.factory.method;

import com.ccr.designpattern.creational.factory.simple.ConcreteProduct;
import com.ccr.designpattern.creational.factory.simple.Product;

public class ConcreteFactory extends Factory {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
