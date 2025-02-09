package com.example.behavioral.observer;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:51
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver1 = new ConcreteObserver("张三");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("李四");

        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);

        concreteSubject.setLatestNews("新闻发布！");
    }
}
