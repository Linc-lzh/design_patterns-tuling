package com.book.designpattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        new AllMessageClient(new WindowsImplementation())
                .sendMessageAll("abc@gmail.com", "Test");
        System.out.println();
        new AllMessageClient(new PosixImplementation())
                .sendMessageAll("abc@gmail.com", "Test");
    }
}
