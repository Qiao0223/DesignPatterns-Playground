package com.example.creational.simplefactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 16:50
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        //创建产品A
        Product productA = factory.createProduct("A");
        productA.operation();

        //创建产品B
        Product productB = factory.createProduct("B");
        productB.operation();
    }
}
