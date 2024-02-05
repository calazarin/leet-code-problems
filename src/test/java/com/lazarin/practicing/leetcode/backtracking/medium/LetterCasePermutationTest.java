package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link LetterCasePermutation}
 */
public class LetterCasePermutationTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LetterCasePermutation solution = new LetterCasePermutation();
        assertThat(solution.letterCasePermutation("a1b2"), is(Arrays.asList("a1b2","a1B2","A1b2","A1B2")));
        assertThat(solution.letterCasePermutation("3z4"), is(Arrays.asList("3z4","3Z4")));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        LetterCasePermutation solution = new LetterCasePermutation();
    assertThat(solution.letterCasePermutation_2("a1b2"), is(Arrays.asList("a1b2", "A1b2", "a1B2", "A1B2")));
        assertThat(solution.letterCasePermutation_2("3z4"), is(Arrays.asList("3z4","3Z4")));
    }
}
