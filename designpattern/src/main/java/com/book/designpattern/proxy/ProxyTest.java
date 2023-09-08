package com.book.designpattern.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        GeometryCalculatorBean circle = GeometryCalculatorBeanFactory.REMOTE_PROXY.makeGeometryCalculator();
        System.out.printf("Circle diameter %fn", circle.calculateCircleCircumference(new Circle()));
    }
}
