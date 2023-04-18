package com.book.designpattern.singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance;
    private SimpleSingleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public static SimpleSingleton getInstance(){
        if(instance == null){
            synchronized (SimpleSingleton.class){
                if(instance == null)
                    instance = new SimpleSingleton();
            }
        }

        return instance;
    }

    public void doSomething(){
        System.out.println("Something is done.");
    }

    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        System.out.println(singleton);
        singleton.doSomething();
        singleton = SimpleSingleton.getInstance();
        System.out.println(singleton);
    }
}
