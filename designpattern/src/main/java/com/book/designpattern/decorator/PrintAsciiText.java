package com.book.designpattern.decorator;

public class PrintAsciiText implements PrintText{
    @Override
    public void print(String text) {
        System.out.println("Print ASCII:" + text);
    }
}
