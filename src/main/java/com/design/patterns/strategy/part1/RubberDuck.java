package com.design.patterns.strategy.part1;

public class RubberDuck extends Duck {


    //    adding wingsCount here (CHANGE-3)
    public RubberDuck(int wingsCount) {
        super(wingsCount);
    }

    // Breaks Liskov Substitution Principle
    @Override
    public String fly() {
        throw new UnsupportedOperationException("LOL I CANT FLY");

    }
}
