package com.example.creational.prototype;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 19:06
 */
public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public String getName() {
        return name;
    }
}
