package com.example.creational.builder;

/**
 * @author Qiao
 * @version 1.0
 * @description: TODO
 * @date 2025/2/9 18:28
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        Director director = new Director(gamingBuilder);
        director.constructComputer();
        Computer gamingComputer = gamingBuilder.getComputer();
        System.out.println(gamingComputer);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director = new Director(officeBuilder);
        director.constructComputer();
        Computer officeComputer = officeBuilder.getComputer();
        System.out.println(officeComputer);
    }
}
