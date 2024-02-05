package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link NonDecreasingSubsequences}
 */
public class NonDecreasingSubsequencesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        NonDecreasingSubsequences solution = new NonDecreasingSubsequences();
        assertThat(solution.findSubsequences(new int[]{4,6,7,7}),
                hasItems(
                        Arrays.asList(4,6),
                        Arrays.asList(4,6,7),
                        Arrays.asList(4,6,7,7),
                        Arrays.asList(4,7),
                        Arrays.asList(4,7,7),
                        Arrays.asList(6,7),
                        Arrays.asList(6,7,7),
                        Arrays.asList(7,7)));

        assertThat(solution.findSubsequences(new int[]{4,4,3,2,1}),
                hasItems(Arrays.asList(4,4)));
    }


    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        NonDecreasingSubsequences solution = new NonDecreasingSubsequences();
        assertThat(solution.findSubsequences_2(new int[]{4,6,7,7}),
                hasItems(
                        Arrays.asList(4,6),
                        Arrays.asList(4,6,7),
                        Arrays.asList(4,6,7,7),
                        Arrays.asList(4,7),
                        Arrays.asList(4,7,7),
                        Arrays.asList(6,7),
                        Arrays.asList(6,7,7),
                        Arrays.asList(7,7)));

        assertThat(solution.findSubsequences_2(new int[]{4,4,3,2,1}),
                hasItems(Arrays.asList(4,4)));
    }
}
