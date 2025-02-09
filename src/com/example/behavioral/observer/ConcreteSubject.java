package com.example.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:41
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update(latestNews);
        }
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifyObservers();
    }
}
