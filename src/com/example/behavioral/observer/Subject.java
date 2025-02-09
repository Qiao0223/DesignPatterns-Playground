package com.example.behavioral.observer;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:40
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
