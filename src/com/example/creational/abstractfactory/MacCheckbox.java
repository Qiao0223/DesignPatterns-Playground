package com.example.creational.abstractfactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:32
 */
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac Checkbox.");
    }

    @Override
    public void onCheck() {
        System.out.println("Mac Checkbox checked.");
    }
}
