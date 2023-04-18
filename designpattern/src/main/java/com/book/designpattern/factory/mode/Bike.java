package com.book.designpattern.factory.mode;

public class Bike extends Vehicle{
    @Override
    public Bike newInstance() {
        return new Bike();
    }
}
