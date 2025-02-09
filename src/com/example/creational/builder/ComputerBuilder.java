package com.example.creational.builder;

import java.security.cert.CertPathValidator;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:09
 */
public abstract class ComputerBuilder {
    protected Computer computer;

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void buildCPU();
    public abstract void buildRAM();
    public abstract void buildHDD();
    public abstract void buildGPU();

    public Computer getComputer() {
        return computer;
    }
}
