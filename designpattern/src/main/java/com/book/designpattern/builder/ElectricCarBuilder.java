package com.book.designpattern.builder;

public class ElectricCarBuilder extends CarBuilder{
    private Car car;

    public ElectricCarBuilder() {
    }

    @Override
    protected Car buildCar() {
        car = new Car();
        return this.car;
    }

    @Override
    protected Car addEngine(String type) {
        this.car.setEngine(type);
        return this.car;
    }

    @Override
    protected Car addWheel(String wheel) {
        this.car.getWheel().add(wheel);
        return this.car;
    }

    @Override
    protected Car paint(String color) {
        this.car.setColor(color);
        return this.car;
    }

    @Override
    protected Car addTransmission(String transmission) {
        this.car.setTransmission(transmission);
        return this.car;
    }

    @Override
    protected Car addGasTank(String gasTank) {
        this.car.setGasTank(gasTank);
        return this.car;
    }

    @Override
    protected Car addBatteries(String batteries) {
        this.car.setBatteries(batteries);
        return this.car;
    }

    @Override
    protected Car getCar() {
        return this.car;
    }
}
