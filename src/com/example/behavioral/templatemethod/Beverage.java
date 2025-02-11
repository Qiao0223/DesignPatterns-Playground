package com.example.behavioral.templatemethod;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/11 15:00
 */
abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();
    protected abstract void brew() ;
}
