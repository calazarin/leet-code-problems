package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ReverseWordsInAString}
 */
public class ReverseWordsInAStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ReverseWordsInAString solution = new ReverseWordsInAString();

        assertThat(solution.reverseWords("the sky is blue"), is("blue is sky the"));
        assertThat(solution.reverseWords("  hello world  "), is("world hello"));
        assertThat(solution.reverseWords("a good   example"), is("example good a"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ReverseWordsInAString solution = new ReverseWordsInAString();

        assertThat(solution.reverseWords_2("the sky is blue"), is("blue is sky the"));
        assertThat(solution.reverseWords_2("  hello world  "), is("world hello"));
        assertThat(solution.reverseWords_2("a good   example"), is("example good a"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        ReverseWordsInAString solution = new ReverseWordsInAString();

        assertThat(solution.reverseWords_3("the sky is blue"), is("blue is sky the"));
        assertThat(solution.reverseWords_3("  hello world  "), is("world hello"));
        assertThat(solution.reverseWords_3("a good   example"), is("example good a"));
    }
}
