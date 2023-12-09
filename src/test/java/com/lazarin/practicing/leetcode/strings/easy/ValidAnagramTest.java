package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ValidAnagram}
 */
public class ValidAnagramTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ValidAnagram solution = new ValidAnagram();
        assertThat(solution.isAnagram("anagram", "nagaram"), is(true));
        assertThat(solution.isAnagram("rat", "car"), is(false));
    }
}
