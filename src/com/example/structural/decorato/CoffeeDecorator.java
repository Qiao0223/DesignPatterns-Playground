package com.example.structural.decorato;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/10 13:46
 */
public class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String make() {
        return decoratedCoffee.make();
    }

    @Override
    public double cost() {
        return this.decoratedCoffee.cost();
    }
}
