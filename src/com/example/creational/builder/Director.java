package com.example.creational.builder;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:24
 */
public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.createNewComputer();
        builder.buildCPU();
        builder.buildRAM();
        builder.buildHDD();
        builder.buildGPU();
    }
}
