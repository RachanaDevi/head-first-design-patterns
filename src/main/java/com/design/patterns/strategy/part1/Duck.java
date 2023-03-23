package com.design.patterns.strategy.part1;

public class Duck {

    public void swim() {
        System.out.println("SWIM");
    }

    public String display() {
       return "ITS ME, the duck";
    }

    public void quack() {
        System.out.println("QUACK");
    }
}
