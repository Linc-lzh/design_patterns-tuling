package com.book.designpattern.facade;

public interface CoffeeMaker {
    void pourWater(Water water);
    void placeCup(CoffeeCup cup);
    void startBrewing(GroundCoffee groundCoffee);
    CoffeeCup finishBrewing();
}
