package com.ccr.designpattern.creational.factory.method;

import com.ccr.designpattern.creational.factory.simple.ConcreteProduct1;
import com.ccr.designpattern.creational.factory.simple.Product;

public class ConcreteFactory1 extends Factory {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
