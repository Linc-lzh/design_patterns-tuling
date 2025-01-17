package com.book.designpattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        ArithmeticComposite expr = new MinusOperand(
                new PlusOperand(new NumericValue(1), new NumericValue(4)),
                new NumericValue(2)
        );
        System.out.printf("Value equals %dn", expr.getValue());
    }
}
