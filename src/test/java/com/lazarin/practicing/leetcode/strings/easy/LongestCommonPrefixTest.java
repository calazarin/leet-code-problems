package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestCommonPrefix}
 */
public class LongestCommonPrefixTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        LongestCommonPrefix solution = new LongestCommonPrefix();
        assertThat(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}), is("fl"));
        assertThat(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}), is(""));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        LongestCommonPrefix solution = new LongestCommonPrefix();
        assertThat(solution.longestCommonPrefix_2(new String[]{"flower","flow","flight"}), is("fl"));
        assertThat(solution.longestCommonPrefix_2(new String[]{"dog","racecar","car"}), is(""));
    }
}
