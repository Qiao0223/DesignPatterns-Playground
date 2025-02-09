package com.example.creational.abstractfactory;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 17:36
 */
public class Client {
    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI(){
        button.render();
        checkbox.render();
    }

    public void handleEvents(){
        button.onClick();
        checkbox.onCheck();
    }

    public static void main(String[] args) {
        //选择Windows工厂
        GUIFactory factory = new WindowsFactory();
        Client client = new Client(factory);
        client.handleEvents();
        client.renderUI();

        System.out.println();
        //选择Mac工厂
        factory = new MacFactory();
        client = new Client(factory);
        client.handleEvents();
        client.renderUI();
    }
}
