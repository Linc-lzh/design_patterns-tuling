package com.book.designpattern.composite;

public class PlusOperand extends ArithmeticOperand{
    public PlusOperand(ArithmeticComposite left, ArithmeticComposite right) {
        super(left, right);
    }

    public int getValue(){
        return left.getValue() + right.getValue();
    }
}
