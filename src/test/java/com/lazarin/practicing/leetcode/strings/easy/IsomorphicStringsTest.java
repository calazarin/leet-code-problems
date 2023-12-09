package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link IsomorphicStrings}
 */
public class IsomorphicStringsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        IsomorphicStrings solution = new IsomorphicStrings();
        assertThat(solution.isIsomorphic("egg","add"), is(true));
        assertThat(solution.isIsomorphic("foo","bar"), is(false));
        assertThat(solution.isIsomorphic("paper","title"), is(true));
    }
}


