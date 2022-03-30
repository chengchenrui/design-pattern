package com.ccr.designpattern.singleton;

import com.ccr.designpattern.creational.singleton.lazy.SingletonSafe;
import com.ccr.designpattern.creational.singleton.lazy.SingletonSafe2;
import com.ccr.designpattern.creational.singleton.lazy.SingletonUnSafe;
import org.junit.Test;

/**
 * 单例模式测试
 * <p>
 *
 * @see SingletonUnSafe 线程不安全验证
 * @see SingletonSafe 线程安全验证
 * @see SingletonSafe2 线程安全验证
 */
public class SingletonTest {

    @Test
    public void singletonSafeTest() throws InterruptedException {
        // 创建两个线程在if (instance == null) 处断点并设置为Thread调试，
        // 分别让两个线程执行了if (instance == null)为true
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        Thread.sleep(10000000);
    }

    static class SingletonThread implements Runnable {
        @Override
        public void run() {
            SingletonUnSafe singleton = SingletonUnSafe.getInstance();
            System.out.println(singleton);
        }
    }

}
