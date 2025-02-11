package com.example.behavioral.templatemethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/11 15:12
 */
public class Tea extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void brew() {
        System.out.println("Adding lemon");
    }
}
