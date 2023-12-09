package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ReverseVowelsOfaString}
 */
public class ReverseVowelsOfaStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ReverseVowelsOfaString solution = new ReverseVowelsOfaString();

        assertThat(solution.reverseVowels("hello"), is("holle"));
        assertThat(solution.reverseVowels("leetcode"), is("leotcede"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ReverseVowelsOfaString solution = new ReverseVowelsOfaString();

        assertThat(solution.reverseVowels_2("hello"), is("holle"));
        assertThat(solution.reverseVowels_2("leetcode"), is("leotcede"));
    }
}
