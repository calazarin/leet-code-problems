package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link IncreasingTripletSubsequence}
 */
public class IncreasingTripletSubsequenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        IncreasingTripletSubsequence
                solution = new IncreasingTripletSubsequence();

        // Explanation: Any triplet where i < j < k is valid.
        assertThat(solution.increasingTriplet(new int[]{1,2,3,4,5}), is(true));
        //Explanation: No triplet exists.
        assertThat(solution.increasingTriplet(new int[]{5,4,3,2,1}), is(false));
        //Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
        assertThat(solution.increasingTriplet(new int[]{2,1,5,0,4,6}), is(true));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        IncreasingTripletSubsequence
                solution = new IncreasingTripletSubsequence();

        // Explanation: Any triplet where i < j < k is valid.
        assertThat(solution.increasingTriplet2(new int[]{1,2,3,4,5}), is(true));
        //Explanation: No triplet exists.
        assertThat(solution.increasingTriplet2(new int[]{5,4,3,2,1}), is(false));
        //Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
        assertThat(solution.increasingTriplet2(new int[]{2,1,5,0,4,6}), is(true));


    }
}
