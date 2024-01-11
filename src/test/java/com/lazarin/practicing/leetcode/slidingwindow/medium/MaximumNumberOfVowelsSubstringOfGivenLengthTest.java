package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumNumberOfVowelsSubstringOfGivenLength}
 */
public class MaximumNumberOfVowelsSubstringOfGivenLengthTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximumNumberOfVowelsSubstringOfGivenLength solution = new MaximumNumberOfVowelsSubstringOfGivenLength();

        assertThat(solution.maxVowels("abciiidef",3), is(3));
        assertThat(solution.maxVowels("aeiou",2), is(2));
        assertThat(solution.maxVowels("leetcode",3), is(2));
    }
}
