package com.design.patterns.strategy.part3_experiment;

import com.design.patterns.strategy.part3_experiment.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3_experiment.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3_experiment.behaviour.Quack;
import com.design.patterns.strategy.part3_experiment.behaviour.QuackBehaviour;

// the problem on implementing the interface rather than doing composition is
// you have to provide the implementation everywhere
// you have to add your method everywhere
// but in the case of Duck having composition, you will only need to change the duck class
// here also you are not programming to an interface, but rather an implementation, in a way
// any impact in same class like MallardDuck and RedHeadDuck means that you will have to change both the classes
// you will have to plug it everywhere
 // i.e let's say waddle comes up
// waddlebehaviour will have to be added in RedHeadDuck and MallardDuck
// the only difference is it a few steps?
// 1. if you do by interface implementation, new method, and then implementation
// 2. if you do by class you just have to provide the instance

// the only reason I am able to come up with now is the number of steps required.

// what is the impact of change required?

// there is duplication of code when you're going this way you can say in a way
// but not really
public class MallardDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public String display() {
        return "I AM A MALLARD DUCK";
    }

    // why can't we do it like this? instead of composition
    @Override
    public String fly() {
        return FlyWithWings.INSTANCE.fly();
    }

    @Override
    public String quack() {
        return Quack.INSTANCE.quack();
    }
}
