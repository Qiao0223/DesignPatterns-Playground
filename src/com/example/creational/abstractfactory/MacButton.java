package com.example.creational.abstractfactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:31
 */
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac Button.");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button clicked.");
    }
}
