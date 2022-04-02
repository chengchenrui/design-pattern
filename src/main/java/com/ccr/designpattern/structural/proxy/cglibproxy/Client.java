package com.ccr.designpattern.structural.proxy.cglibproxy;

import com.ccr.designpattern.structural.proxy.staticproxy.RealSubject;
import com.ccr.designpattern.structural.proxy.staticproxy.Subject;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        CglibProxy cglibProxy = new CglibProxy();
        Class<?> clazz = Class.forName("com.ccr.designpattern.structural.proxy.staticproxy.RealSubject");

        // 代理接口
        Subject subject = (Subject) cglibProxy.newInstall(clazz.newInstance());
        subject.doOperation();

        System.out.println("--------------------");

        // 代理类
        RealSubject realSubject = (RealSubject) cglibProxy.newInstall(clazz.newInstance());
        realSubject.doOperation();
    }
}
