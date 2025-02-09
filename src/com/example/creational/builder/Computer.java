package com.example.creational.builder;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:03
 */
public class Computer {
    private String CPU;
    private String RAM;
    private String HDD;
    private String GPU;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", HDD=" + HDD + ", GPU=" + GPU + "]";
    }
}
