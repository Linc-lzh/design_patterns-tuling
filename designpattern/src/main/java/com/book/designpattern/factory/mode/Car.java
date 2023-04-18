package com.book.designpattern.factory.mode;

public class Car extends Vehicle{
    @Override
    public Car newInstance() {
        return new Car();
    }
}
