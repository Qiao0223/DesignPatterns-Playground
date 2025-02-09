package com.example.creational.singleton;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 20:59
 *
 * Bill Pugh Singleton 的线程安全性是由 JVM 类加载机制保证的：
 * 静态内部类（SingletonHolder）是懒加载的，只有在 getInstance() 方法被调用时，SingletonHolder 类才会被加载。由于类加载是线程安全的，
 * JVM 确保了类在加载时只有一个线程会初始化 INSTANCE。
 * 在 类加载 时，INSTANCE 只会被创建一次，这就避免了在多线程环境下可能出现的多次创建实例的风险。
 */
public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
