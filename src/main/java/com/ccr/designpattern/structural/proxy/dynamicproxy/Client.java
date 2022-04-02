package com.ccr.designpattern.structural.proxy.dynamicproxy;

import com.ccr.designpattern.structural.proxy.staticproxy.RealSubject;
import com.ccr.designpattern.structural.proxy.staticproxy.Subject;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 1. 创建调用处理器类对象
        DynamicProxy dynamicProxy = new DynamicProxy();
        // 2. 创建目标对象对象
        Subject realSubject = new RealSubject();
        System.out.println("ClassLoader " + realSubject.getClass().getClassLoader());
        System.out.println("Interfaces " + Arrays.toString(realSubject.getClass().getInterfaces()));
        // 3. 创建动态代理类 & 对象：通过调用处理器类对象newProxyInstance（）
        Subject subjectProxy = (Subject) dynamicProxy.newProxyInstance(realSubject);
        // 4. 通过调用动态代理对象方法从而调用目标对象方法
        // 实际上是调用了invoke（），再通过invoke（）里的反射机制调用目标对象的方法
        subjectProxy.doOperation();

        System.out.println("--------------------------");

        Class<?> clazz = Class.forName("com.ccr.designpattern.structural.proxy.staticproxy.RealSubject");
        // RealSubject realSubject2 = (RealSubject) clazz.newInstance();
        Subject realSubject1 = (Subject) dynamicProxy.newProxyInstance(clazz.newInstance());
        realSubject1.doOperation();
    }
}
