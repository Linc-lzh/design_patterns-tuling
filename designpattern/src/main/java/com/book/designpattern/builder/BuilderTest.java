package com.book.designpattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        CarBuilderDirector director = new CarBuilderDirector();
        Car electricCar = director.buildElectricCar(new ElectricCarBuilder());
        Car hybridCar = director.buildHybridCar(new GasolineCarBuilder());

        System.out.println(electricCar);
        System.out.println(hybridCar);
    }
}
