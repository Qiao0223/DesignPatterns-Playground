package com.example.structural.adapter;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/12 15:21
 */
public class CircleAdapter implements Shape {
    private OldSystemCircle circle;

    public CircleAdapter(OldSystemCircle circle) {
        this.circle = circle;
    }

    @Override
    public void draw() {
        circle.drawCircle();
    }
}
