package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link IsSubsequence}
 */
public class IsSubsequenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        IsSubsequence solution = new IsSubsequence();
        assertThat(solution.isSubsequence("abc","ahbgdc"), is(true));
        assertThat(solution.isSubsequence("axc","ahbgdc"), is(false));
    }
}
