package com.ccr.designpattern.singleton.lazy;

/**
 * 懒汉模式,非线程安全
 * @author chengchenrui
 * @version Id: Singleton.java, v 0.1 2018/8/19 10:53 chengchenrui Exp $$
 */
public class Singleton {

    /**
     * 定义实例
     */
    private static Singleton instance;

    /**
     * 私有构造方法
     */
    private Singleton() {
    }

    /**
     * 对外提供获取实例的静态方法
     * @return
     */
    public static Singleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}