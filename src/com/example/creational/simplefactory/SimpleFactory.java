package com.example.creational.simplefactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 16:42
 */
public class SimpleFactory {
    public Product createProduct(String productType) {
        if("A".equalsIgnoreCase(productType)) {
            return new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(productType)) {
            return new ConcreteProductB();
        }else {
            throw new IllegalArgumentException("Unsupported product type: " + productType);
        }
    }
}
