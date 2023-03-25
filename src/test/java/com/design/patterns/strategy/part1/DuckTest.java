package com.design.patterns.strategy.part1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuckTest {


    @Test
    void shouldDisplayMallardDuck() {
        // changes in tests MallardDuck CHANGE-4
        Duck mallardDuck = new MallardDuck(2); // does not break LSP yet

        assertThat(mallardDuck.display()).isEqualTo("I AM A MALLARD DUCK");
    }

    @Test
    void shouldDisplayRedHeadDuck() {
        // changes in tests RedHeadDuck CHANGE-5
        Duck mallardDuck = new RedheadDuck(2);

        assertThat(mallardDuck.display()).isEqualTo("I AM A REDHEAD DUCK");
    }


    // SHOULD NOT BE ALLOWED, Throws exception and breaks LSP
    @Test
    @Disabled
    void isMakingRubberDuckFly() {
        // changes in tests for RubberDuck CHANGE-6
        Duck mallardDuck = new RubberDuck(2);

        assertThat(mallardDuck.fly()).isEqualTo("I CAN FLYYYY");
    }
}