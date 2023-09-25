package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MissingNumber}
 */
public class MissingNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MissingNumber solution = new MissingNumber();

        assertThat(solution.missingNumber(new int[]{3,0,1}), is(2));
        assertThat(solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), is(8));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        MissingNumber solution = new MissingNumber();

        assertThat(solution.missingNumber2(new int[]{3,0,1}), is(2));
        assertThat(solution.missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}), is(8));

    }

}
