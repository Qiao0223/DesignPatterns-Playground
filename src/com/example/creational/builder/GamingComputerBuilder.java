package com.example.creational.builder;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:21
 */
public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i9");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("1TB SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("NVIDIA RTX 3080");
    }
}
