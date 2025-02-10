package com.example.structural.decorato;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/10 13:49
 */
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String make(){
        return decoratedCoffee.make()+ "with milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.0;
    }
}
