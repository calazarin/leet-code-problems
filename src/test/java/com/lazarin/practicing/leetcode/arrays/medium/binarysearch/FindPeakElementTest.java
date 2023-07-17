package com.lazarin.practicing.leetcode.arrays.medium.binarysearch;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindPeakElement}
 */
public class FindPeakElementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        FindPeakElement solution = new FindPeakElement();

        //Explanation: 3 is a peak element and your function should return the index number 2.
        assertThat(solution.findPeakElement(new int[]{1,2,3,1}), is(2));
        //Explanation: this function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
        assertThat(solution.findPeakElement(new int[]{1,2,1,3,5,6,4}),is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        FindPeakElement solution = new FindPeakElement();

        //Explanation: 3 is a peak element and your function should return the index number 2.
        assertThat(solution.findPeakElement2(new int[]{1,2,3,1}), is(2));
        //Explanation: this function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
        assertThat(solution.findPeakElement2(new int[]{1,2,1,3,5,6,4}),is(5));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){

        FindPeakElement solution = new FindPeakElement();

        //Explanation: 3 is a peak element and your function should return the index number 2.
        assertThat(solution.findPeakElement3(new int[]{1,2,3,1}), is(2));
        //Explanation: this function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
        assertThat(solution.findPeakElement3(new int[]{1,2,1,3,5,6,4}),is(5));
    }
}
