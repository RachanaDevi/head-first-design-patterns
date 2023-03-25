package com.design.patterns.strategy.part1;

public class RedheadDuck extends Duck {

    //    adding wingsCount here (CHANGE-2)
    public RedheadDuck(int wingsCount) {
        super(wingsCount);
    }

    @Override
    public String display() {
        return "I AM A REDHEAD DUCK";
    }
}
