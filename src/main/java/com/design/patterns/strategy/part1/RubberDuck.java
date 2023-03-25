package com.design.patterns.strategy.part1;

public class RubberDuck extends Duck {

    // Breaks Liskov Substitution Principle
    @Override
    public String fly() {
        throw new UnsupportedOperationException("LOL I CANT FLY");

    }
}
