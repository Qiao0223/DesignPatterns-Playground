package com.example.creational.singleton;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 20:03
 */
public class EagerSingleton {
    // 在类加载时创建实例，保证类加载时即创建唯一实例
    private static EagerSingleton instance = new EagerSingleton();

    // 私有构造函数，防止外部直接创建实例
    private EagerSingleton() {}

    // 公共的静态方法，提供对外访问唯一实例的方式
    public static EagerSingleton getInstance() {
        return instance;  // 直接返回已创建的实例
    }
}
