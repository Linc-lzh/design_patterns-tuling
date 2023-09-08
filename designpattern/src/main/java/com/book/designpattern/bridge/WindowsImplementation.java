package com.book.designpattern.bridge;

public class WindowsImplementation implements PlatformBridge {
    @Override
    public void forwardMessage(String msg) {
        System.out.printf("Sending message n%s nForm the windows machine", msg);
    }
}
