package com.book.designpattern.singleton;

public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();
    private LockFreeSingleton(){
        System.out.println("Singleton is Instantiated.");
    }

    private static synchronized LockFreeSingleton getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }

    public static void main(String[] args) {
        LockFreeSingleton singleton = LockFreeSingleton.getInstance();
        System.out.println(singleton);
        singleton.doSomething();
        singleton = LockFreeSingleton.getInstance();
        System.out.println(singleton);
    }
}
