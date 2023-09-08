package com.book.designpattern.composite;

public class ArithmeticOperand implements ArithmeticComposite{
    protected ArithmeticComposite left;
    protected ArithmeticComposite right;
    public ArithmeticOperand(ArithmeticComposite left, ArithmeticComposite right){
        this.left = left;
        this.right = right;
    }
    @Override
    public int getValue() {
        return 0;
    }
}
