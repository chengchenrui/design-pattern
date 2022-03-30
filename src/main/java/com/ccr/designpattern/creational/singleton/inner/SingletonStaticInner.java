package com.ccr.designpattern.creational.singleton.inner;

/**
 * 静态内部类实现
 * <p>
 * 当 SingletonStaticInner 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getInstance() 方法从而触发 SingletonHolder.instance 时 SingletonHolder 才会被加载，此时初始化 instance 实例。
 * <p>
 * 这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持
 */
public class SingletonStaticInner {
    private SingletonStaticInner() {
    }

    private static class SingletonHolder {
        private static final SingletonStaticInner instance = new SingletonStaticInner();
    }

    public static SingletonStaticInner getInstance() {
        return SingletonHolder.instance;
    }
}
