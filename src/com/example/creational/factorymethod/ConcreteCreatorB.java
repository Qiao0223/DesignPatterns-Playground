package com.example.creational.factorymethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:17
 */
public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
