package com.example.creational.abstractfactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:30
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows Button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button clicked.");
    }
}
