package com.example.behavioral.strategy;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:28
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
