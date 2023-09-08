package com.book.designpattern.facade;

public class SuperstarCoffeeMachine implements CoffeeMachineFacade{
    @Override
    public CoffeeCup serveCoffe() throws Exception {
        CoffeeGrinder grinder = new SuperstarCoffeeGrinder();
        CoffeeMaker brewer = new SuperstarCoffeeMaker();
        CoffeeCup cup = new CoffeeCup();
        grinder.startGrinding();
        Thread.sleep(500);
        brewer.placeCup(cup);
        brewer.pourWater(new Water());
        brewer.startBrewing(grinder.stopGrinding());
        Thread.sleep(1000);
        return brewer.finishBrewing();
    }
}
