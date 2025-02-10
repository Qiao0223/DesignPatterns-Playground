package com.example.structural.decorato;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/10 14:02
 */
public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.make() + "$" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.make() + " $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.make() + " $" + sugarMilkCoffee.cost());
    }
}
