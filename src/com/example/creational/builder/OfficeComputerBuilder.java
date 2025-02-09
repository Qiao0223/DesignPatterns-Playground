package com.example.creational.builder;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:23
 */
public class OfficeComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("8GB");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("500GB HDD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Integrated Graphics");
    }
}
