package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FibonacciNumber}
 */
public class FibonacciNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        FibonacciNumber solution = new FibonacciNumber();

        assertThat(solution.fib(2), is(1));
        assertThat(solution.fib(3), is(2));
        assertThat(solution.fib(4), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        FibonacciNumber solution = new FibonacciNumber();

        assertThat(solution.fib_2(2), is(1));
        assertThat(solution.fib_2(3), is(2));
        assertThat(solution.fib_2(4), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        FibonacciNumber solution = new FibonacciNumber();

        assertThat(solution.fib_3(2), is(1));
        assertThat(solution.fib_3(3), is(2));
        assertThat(solution.fib_3(4), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach4(){
        FibonacciNumber solution = new FibonacciNumber();

        assertThat(solution.fib_4(2), is(1));
        assertThat(solution.fib_4(3), is(2));
        assertThat(solution.fib_4(4), is(3));
    }
}
