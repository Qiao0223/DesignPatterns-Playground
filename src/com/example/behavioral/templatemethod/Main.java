package com.example.behavioral.templatemethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/11 15:13
 */
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n----");

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
