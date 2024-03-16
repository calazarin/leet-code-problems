package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ConstructSmallestNumberFromDIString}
 */
public class ConstructSmallestNumberFromDIStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ConstructSmallestNumberFromDIString solution = new ConstructSmallestNumberFromDIString();
        assertThat(solution.smallestNumber("IIIDIDDD"), is("123549876"));
        assertThat(solution.smallestNumber("DDD"), is("4321"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        ConstructSmallestNumberFromDIString solution = new ConstructSmallestNumberFromDIString();
        assertThat(solution.smallestNumber_2("IIIDIDDD"), is("123549876"));
        assertThat(solution.smallestNumber_2("DDD"), is("4321"));
    }

}
