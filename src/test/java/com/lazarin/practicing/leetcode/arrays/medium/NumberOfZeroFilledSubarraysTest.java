package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfZeroFilledSubarrays}
 */
public class NumberOfZeroFilledSubarraysTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        NumberOfZeroFilledSubarrays
                solution = new NumberOfZeroFilledSubarrays();

        /*Explanation:
        There are 4 occurrences of [0] as a subarray.
        There are 2 occurrences of [0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.*/
        assertThat(solution.zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}), is(6l));

        /*Explanation:
        There are 5 occurrences of [0] as a subarray.
        There are 3 occurrences of [0,0] as a subarray.
        There is 1 occurrence of [0,0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.*/
        assertThat(solution.zeroFilledSubarray(new int[]{0,0,0,2,0,0}), is(9l));

        /*Explanation: There is no subarray filled with 0. Therefore, we return 0.*/
        assertThat(solution.zeroFilledSubarray(new int[]{2,10,2019}), is(0l));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        NumberOfZeroFilledSubarrays
                solution = new NumberOfZeroFilledSubarrays();

        /*Explanation:
        There are 4 occurrences of [0] as a subarray.
        There are 2 occurrences of [0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.*/
        assertThat(solution.zeroFilledSubarray2(new int[]{1,3,0,0,2,0,0,4}), is(6l));

        /*Explanation:
        There are 5 occurrences of [0] as a subarray.
        There are 3 occurrences of [0,0] as a subarray.
        There is 1 occurrence of [0,0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.*/
        assertThat(solution.zeroFilledSubarray2(new int[]{0,0,0,2,0,0}), is(9l));

        /*Explanation: There is no subarray filled with 0. Therefore, we return 0.*/
        assertThat(solution.zeroFilledSubarray2(new int[]{2,10,2019}), is(0l));
    }
}
