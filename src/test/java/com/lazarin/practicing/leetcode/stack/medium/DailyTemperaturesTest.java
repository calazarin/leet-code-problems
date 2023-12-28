package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link com.lazarin.practicing.leetcode.stack.medium.DailyTemperatures}
 */
public class DailyTemperaturesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertThat(dailyTemperatures.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}),
                is(new int[]{1,1,4,2,1,1,0,0}));
        assertThat(dailyTemperatures.dailyTemperatures(new int[]{30,40,50,60}),
                is(new int[]{1,1,1,0}));
        assertThat(dailyTemperatures.dailyTemperatures(new int[]{30,60,90}),
                is(new int[]{1,1,0}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertThat(dailyTemperatures.dailyTemperatures_2(new int[]{73,74,75,71,69,72,76,73}),
                is(new int[]{1,1,4,2,1,1,0,0}));

        assertThat(dailyTemperatures.dailyTemperatures_2(new int[]{30,40,50,60}),
                is(new int[]{1,1,1,0}));
        assertThat(dailyTemperatures.dailyTemperatures_2(new int[]{30,60,90}),
                is(new int[]{1,1,0}));
    }
}
