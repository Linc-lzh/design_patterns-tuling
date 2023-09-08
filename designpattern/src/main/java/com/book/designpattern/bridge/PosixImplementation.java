package com.book.designpattern.bridge;

public class PosixImplementation implements PlatformBridge{
    @Override
    public void forwardMessage(String msg) {
        System.out.printf("Sending message n%s nForm the linux machine", msg);
    }
}
