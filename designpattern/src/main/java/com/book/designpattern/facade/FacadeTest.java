package com.book.designpattern.facade;

public class FacadeTest {
    public static void main(String[] args) throws Exception {
        CoffeeMachineFacade facade = new SuperstarCoffeeMachine();
        facade.serveCoffe();
    }
}
