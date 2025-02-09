package com.example.behavioral.observer;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:48
 */
public class ConcreteObserver implements Observer {
    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + "收到新闻更新 " + message);
    }
}
