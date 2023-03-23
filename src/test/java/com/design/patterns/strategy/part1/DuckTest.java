package com.design.patterns.strategy.part1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuckTest {


    @Test
    void shouldDisplayMallardDuck() {
        Duck mallardDuck = new MallardDuck(); // does not break LSP yet

        assertThat(mallardDuck.display()).isEqualTo("I AM A MALLARD DUCK");
    }

    @Test
    void shouldDisplayRedHeadDuck() {
        Duck mallardDuck = new RedheadDuck();

        assertThat(mallardDuck.display()).isEqualTo("I AM A REDHEAD DUCK");
    }
}