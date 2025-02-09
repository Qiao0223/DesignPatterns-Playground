package com.example.creational.abstractfactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:31
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows Checkbox.");
    }

    @Override
    public void onCheck() {
        System.out.println("Windows Checkbox checked.");
    }
}
