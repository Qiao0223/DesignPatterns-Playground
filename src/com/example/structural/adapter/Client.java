package com.example.structural.adapter;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/12 15:22
 */
public class Client {
    public static void main(String[] args) {
        OldSystemCircle oldCricle = new OldSystemCircle();
        Shape shape = new CircleAdapter(oldCricle);

        shape.draw();
    }
}
