package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MaximumLengthOfAConcatenatedStringWithUniqueCharacters}
 */
public class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximumLengthOfAConcatenatedStringWithUniqueCharacters solution = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();
        assertThat(solution.maxLength(Arrays.asList("un","iq","ue")), is(4));
        assertThat(solution.maxLength(Arrays.asList("cha","r","act","ers")), is(6));
        assertThat(solution.maxLength(Arrays.asList("abcdefghijklmnopqrstuvwxyz")), is(26));
    }
}
