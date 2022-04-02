package com.ccr.designpattern.structural.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.doOperation();
    }
}
