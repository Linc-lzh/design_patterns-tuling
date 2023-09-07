package com.book.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String engine;
    private List<String> wheel = new ArrayList<>();
    private String color;
    private String transmission;
    private String gasTank;
    private String batteries;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public List<String> getWheel() {
        return wheel;
    }

    public void setWheel(List<String> wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel=" + wheel +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", gasTank='" + gasTank + '\'' +
                ", batteries='" + batteries + '\'' +
                '}';
    }
}
