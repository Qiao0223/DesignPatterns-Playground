package com.example.behavioral.strategy;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 21:25
 */

/*
Strategy 接口 定义了一个 execute() 方法，所有的具体策略类都实现该方法。
ConcreteStrategyA 和 ConcreteStrategyB 是具体的策略类，实现了 execute() 方法，提供不同的行为。
Context 类 持有 Strategy 对象，并通过 setStrategy() 方法动态切换策略。在 executeStrategy() 方法中调用当前策略的 execute() 方法。
客户端通过传入不同的策略，来决定 Context 执行不同的算法或行为。
* */
public class Context {
    private Strategy strategy;  // 持有一个策略对象

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
