package com.lazarin.practicing.leetcode.trie.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link MaximumXorOfTwoNumbersInArray}
 */
public class MaximumXorOfTwoNumbersInArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_test1() {

        MaximumXorOfTwoNumbersInArray maximumXorOfTwoNumbersInArray =
                new MaximumXorOfTwoNumbersInArray();

        assertThat(maximumXorOfTwoNumbersInArray.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}),
                is(28));

        assertThat(maximumXorOfTwoNumbersInArray.findMaximumXOR(new int[] {14,70,53,83,49,91,36,80,92,51,66,70}),
                is(127));
    }
}
