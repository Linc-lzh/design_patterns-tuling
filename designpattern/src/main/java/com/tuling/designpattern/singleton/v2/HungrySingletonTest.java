package com.tuling.designpattern.singleton.v2;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton instance=HungrySingleton.getInstance();
        HungrySingleton instance1=HungrySingleton.getInstance();
        System.out.println(instance==instance1);
    }
}
class HungrySingleton{

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
