package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ThirdMaximumNumber}
 */
public class ThirdMaximumNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        ThirdMaximumNumber solution = new ThirdMaximumNumber();

       /*Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.*/
        assertThat(solution.thirdMax(new int[]{3,2,1}), is(1));

       /* Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.*/
        assertThat(solution.thirdMax(new int[]{1,2}), is(2));

       /* Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.*/
        assertThat(solution.thirdMax(new int[]{2,2,3,1}), is(1));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        ThirdMaximumNumber solution = new ThirdMaximumNumber();

       /*Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.*/
        assertThat(solution.thirdMax2(new int[]{3,2,1}), is(1));

       /* Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.*/
        assertThat(solution.thirdMax2(new int[]{1,2}), is(2));

       /* Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.*/
        assertThat(solution.thirdMax2(new int[]{2,2,3,1}), is(1));

    }

}
