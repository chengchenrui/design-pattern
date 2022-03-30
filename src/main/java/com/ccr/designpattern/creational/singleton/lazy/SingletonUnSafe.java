package com.ccr.designpattern.creational.singleton.lazy;

/**
 * 懒汉模式-非线程安全
 *
 * <p>
 * 私有静态变量 instance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 instance，从而节约资源
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入if (instance == null)
 * 并且此时 instance 为 null，那么会有多个线程执行 instance = new SingletonUnSafe(); 语句，这将导致多次实例化 instance。
 * </p>
 */
public class SingletonUnSafe {

    /**
     * 定义实例
     */
    private static SingletonUnSafe instance;

    /**
     * 私有构造方法
     */
    private SingletonUnSafe() {
    }

    /**
     * 对外提供获取实例的静态方法
     *
     * @return
     */
    public static SingletonUnSafe getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new SingletonUnSafe();
        }
        return instance;
    }
}