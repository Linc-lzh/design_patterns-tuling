package com.book.designpattern.expression;

public class Plus implements Expression{
    Expression left;
    Expression right;
    public Plus(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() + right.interpret();
    }
}
