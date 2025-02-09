package com.example.creational.singleton;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 20:16
 */
public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance; // 线程安全的静态变量

    private DoubleCheckedLocking() {}  // 私有构造函数

    /*
    第一次检查：线程 B 会看到 instance == null，然后进入同步块。即使线程 A 在此时已经分配了内存并赋值了 instance，
    如果线程 B 进入同步块的时机正好在 instance 赋值之前，它依然会看到 instance == null。
    第二次检查：即使线程 A 已经初始化了 instance，线程 B 会在同步块内重新检查一次，确保只有第一个线程（线程 A）创建实例，其他线程直接返回已经创建的实例。
    * */

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {  // 第一次检查，检查实例是否已创建
            synchronized (DoubleCheckedLocking.class) {  // 进入同步代码块，锁住类
                if (instance == null) {  // 再次检查，确保只有一个线程进入实例化代码
                    instance = new DoubleCheckedLocking();  // 创建唯一实例
                }
            }
        }
        return instance;  // 返回唯一实例
    }
}

