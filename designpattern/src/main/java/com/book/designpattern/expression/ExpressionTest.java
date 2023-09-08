package com.book.designpattern.expression;

public class ExpressionTest {
    public static void main(String[] args) {
        Evaluator eval = new Evaluator();
        System.out.println(eval.evaluate("2 3 +"));
        System.out.println(eval.evaluate("4 3 -"));
        System.out.println(eval.evaluate("4 3 - 2 +"));
    }
}
