package com.example.behavioral.templatemethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/11 15:13
 */
public class Coffee extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding sugar and milk");
    }
}
