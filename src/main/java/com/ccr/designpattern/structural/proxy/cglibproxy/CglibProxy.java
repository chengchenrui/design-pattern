package com.ccr.designpattern.structural.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 * <p>
 * 可以代理对象和接口
 */
public class CglibProxy implements MethodInterceptor {

    public Object newInstall(Object proxyObject) {
        return Enhancer.create(proxyObject.getClass(), this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 前置");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib 后置");
        return object;
    }
}
