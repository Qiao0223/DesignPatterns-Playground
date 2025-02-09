package com.example.creational.singleton;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 19:57
 */
public class LazySingleton {
    // 声明一个私有静态变量，存储唯一实例
    private static LazySingleton instance;

    // 私有构造函数，防止外部直接创建实例
    private LazySingleton() {}

    // 公共的静态方法，提供对外访问唯一实例的方式
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton(); // 创建实例
        }
        return instance;
    }
}
