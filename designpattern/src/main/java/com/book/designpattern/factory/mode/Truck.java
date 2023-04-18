package com.book.designpattern.factory.mode;

public class Truck extends Vehicle{
    @Override
    public Truck newInstance() {
        return new Truck();
    }
}
