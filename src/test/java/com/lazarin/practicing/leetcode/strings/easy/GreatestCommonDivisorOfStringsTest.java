package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link GreatestCommonDivisorOfStrings}
 */
public class GreatestCommonDivisorOfStringsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        assertThat(solution.gcdOfStrings("ABCABC","ABC"), is("ABC"));
        assertThat(solution.gcdOfStrings("ABABAB","ABAB"), is("AB"));
        assertThat(solution.gcdOfStrings("LEET","CODE"), is(""));
    }
}
