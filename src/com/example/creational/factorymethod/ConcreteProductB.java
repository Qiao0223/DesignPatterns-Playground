package com.example.creational.factorymethod;

import javax.swing.*;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:08
 */
public class ConcreteProductB implements Product{
    @Override
    public void operation() {
        System.out.println("Product B Operation");
    }
}
