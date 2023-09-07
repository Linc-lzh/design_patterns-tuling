package com.book.designpattern.builder;

public abstract class CarBuilder {
    protected abstract Car buildCar();
    protected abstract Car addEngine(String type);
    protected abstract Car addWheel(String wheel);
    protected abstract Car paint(String color);
    protected abstract Car addTransmission(String transmission);
    protected abstract Car addGasTank(String gasTank);
    protected abstract Car addBatteries(String batteries);
    protected abstract Car getCar();
}
