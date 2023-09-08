package com.book.designpattern.proxy;

public class GeometryBean implements GeometryCalculatorBean{
    @Override
    public double calculateCircleCircumference(Circle circle) {
        return 0.1f;
    }
}
