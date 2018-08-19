package com.ccr.designpattern.singleton.hangry;

/**
 * 饿汉模式
 * @author chengchenrui
 * @version Id: Singleton.java, v 0.1 2018/8/19 10:45 chengchenrui Exp $$
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
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}