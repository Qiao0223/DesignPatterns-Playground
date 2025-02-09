package com.example.creational.prototype;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 19:13
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Prototype1");

        //在原型模式中，clone() 方法的返回类型通常是 接口类型（如 Prototype），但实际返回的是具体的类（如 ConcretePrototype）的实例。
        // 为了能够使用具体类中的方法或属性，必须将返回值从接口类型强制转换为具体类类型。
        ConcretePrototype clone = (ConcretePrototype) original.clone();  // 克隆对象

        System.out.println("Original name: " + original.getName());
        System.out.println("Cloned name: " + clone.getName());
    }
}
