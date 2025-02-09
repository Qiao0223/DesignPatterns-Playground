package com.example.creational.factorymethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:10
 */
public class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
