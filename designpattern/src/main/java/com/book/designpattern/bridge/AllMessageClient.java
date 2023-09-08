package com.book.designpattern.bridge;

public class AllMessageClient extends MessageSender{

    private String to = "development_all@abc.com";
    public AllMessageClient(PlatformBridge implementation) {
        super(implementation);
    }

    public void sendMessageAll(String from, String body){
        sendMessage(from, to, body);
    }
}
