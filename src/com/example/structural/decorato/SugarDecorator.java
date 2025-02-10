package com.example.structural.decorato;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/10 14:01
 */
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String make() {
        return decoratedCoffee.make() + " with sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
