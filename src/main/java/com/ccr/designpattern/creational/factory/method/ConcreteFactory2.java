package com.ccr.designpattern.creational.factory.method;

import com.ccr.designpattern.creational.factory.simple.ConcreteProduct2;
import com.ccr.designpattern.creational.factory.simple.Product;

public class ConcreteFactory2 extends Factory {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
