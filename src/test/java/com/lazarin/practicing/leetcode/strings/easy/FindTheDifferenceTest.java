package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindTheDifference}
 */
public class FindTheDifferenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        FindTheDifference solution = new FindTheDifference();
        assertThat(solution.findTheDifference("abcd","abcde"), is('e'));
        assertThat(solution.findTheDifference("","y"), is('y'));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        FindTheDifference solution = new FindTheDifference();
        assertThat(solution.findTheDifference_2("abcd","abcde"), is('e'));
        assertThat(solution.findTheDifference_2("","y"), is('y'));
    }

}
