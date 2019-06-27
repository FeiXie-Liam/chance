package com.practice.chance;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChanceTest {
    private Chance coinChance;
    private Chance diceChance;

    @Before
    public void setUp() {
        diceChance = new Chance(0.333d);
        coinChance = new Chance(0.5d);
    }

    @Test
    public void should_chance_not_right() {
        //given
        double expectedFraction = 0.667d;
        //when
        //then
        assertThat(diceChance.not()).isEqualToComparingFieldByField(
                new Chance(expectedFraction));
    }

    @Test
    public void should_chance_and_right() {
        //given
        double expectedFraction = 0.333d * 0.5d;
        //when        //then
        assertThat(diceChance.and(coinChance)).isEqualToComparingFieldByField(
                        new Chance(expectedFraction));
    }

    @Test
    public void should_chance_or_right() {
        //given
        double expectedFraction = 1d - (1 - 0.333d) * (1 - 0.5d);
        //when
        //then
        assertThat(diceChance.or(coinChance)).isEqualToComparingFieldByField(
                new Chance(expectedFraction));
    }
}
