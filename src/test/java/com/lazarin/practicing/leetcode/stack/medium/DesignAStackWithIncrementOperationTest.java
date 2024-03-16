package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link DesignAStackWithIncrementOperation}
 */
public class DesignAStackWithIncrementOperationTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DesignAStackWithIncrementOperation.CustomStack solution =
                new DesignAStackWithIncrementOperation().new CustomStack(3);
        solution.push(1);
        solution.push(2);
        assertThat(solution.pop(), is(2));
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.increment(5, 100);
        solution.increment(2, 100);
        assertThat(solution.pop(), is(103));
        assertThat(solution.pop(), is(202));
        assertThat(solution.pop(), is(201));
        assertThat(solution.pop(), is(-1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        DesignAStackWithIncrementOperation.CustomStack2 solution =
                new DesignAStackWithIncrementOperation().new CustomStack2(3);
        solution.push(1);
        solution.push(2);
        assertThat(solution.pop(), is(2));
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.increment(5, 100);
        solution.increment(2, 100);
        assertThat(solution.pop(), is(103));
        assertThat(solution.pop(), is(202));
        assertThat(solution.pop(), is(201));
        assertThat(solution.pop(), is(-1));
    }
}
