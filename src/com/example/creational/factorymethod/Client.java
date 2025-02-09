package com.example.creational.factorymethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:17
 */
public class Client {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.operation();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.operation();
    }
}
