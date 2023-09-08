package com.book.designpattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        final String text = "text";
        final PrintText obj = new PrintAsciiText();
        final PrintText printer = new PrintTextHexDecorator(obj);
        obj.print(text);
        printer.print(text);
    }
}
