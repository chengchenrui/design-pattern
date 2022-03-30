package com.ccr.designpattern.creational.singleton.lazy;

/**
 * 双重校验锁-线程安全
 * <p>
 * instance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，只有当 instance 没有被实例化时，才需要进行加锁
 * <p>
 * instance = new SingletonSafe2()这段代码其实是分为三步执行
 * 1.分配内存空间
 * 2.初始化对象
 * 3.将instance指向分配的内存地址
 * 但是JVM有指令重拍的特性，顺序有可能变为 1>3>2。单线程没有问题。多线程可能得到一个没有被初始化的对象
 * 使用volatile可以禁止JVM指令重排
 */
public class SingletonSafe2 {

    private volatile static SingletonSafe2 instance;

    private SingletonSafe2() {
    }

    public static SingletonSafe2 getInstance() {
        if (instance == null) {
            synchronized (SingletonSafe2.class) {
                if (instance == null) {
                    instance = new SingletonSafe2();
                }
            }
        }
        return instance;
    }
}
