package com.example.structural.decorato;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/10 13:45
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String make() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5;
    }
}
