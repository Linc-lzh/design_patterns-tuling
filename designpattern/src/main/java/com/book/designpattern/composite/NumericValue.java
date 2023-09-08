package com.book.designpattern.composite;

public class NumericValue implements ArithmeticComposite{
    private int value;

    public NumericValue(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
