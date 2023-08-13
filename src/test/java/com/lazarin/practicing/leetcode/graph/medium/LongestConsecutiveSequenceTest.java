package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestConsecutiveSequence}
 */
public class LongestConsecutiveSequenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

       /* Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.*/
        assertThat(solution.longestConsecutive(new int[]{100,4,200,1,3,2}),  is(4));


        /*Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9*/
        assertThat(solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}), is(9));
    }
}
