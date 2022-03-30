package com.ccr.designpattern.creational.singleton.hangry;

/**
 * 饿汉模式
 * <p>
 * 直接实例化 instance 的方式就不会产生线程不安全问题
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处
 * </p>
 */
public class Singleton {

    /**
     * 在类内部实例化一个实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 私有的构造函数,外部无法访问
     */
    private Singleton() {
    }

    /**
     * 对外提供获取实例的静态方法
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}