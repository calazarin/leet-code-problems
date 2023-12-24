package com.lazarin.practicing.leetcode.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 *{@link ReverseWordsInaStringIII}
 */
public class ReverseWordsInaStringIIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ReverseWordsInaStringIII solution =  new ReverseWordsInaStringIII();
        assertThat(solution.reverseWords("Let's take LeetCode contest"), is("s'teL ekat edoCteeL tsetnoc"));
        assertThat(solution.reverseWords("Mr Ding"), is("rM gniD"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        ReverseWordsInaStringIII solution =  new ReverseWordsInaStringIII();
        assertThat(solution.reverseWords_2("Let's take LeetCode contest"), is("s'teL ekat edoCteeL tsetnoc"));
        assertThat(solution.reverseWords_2("Mr Ding"), is("rM gniD"));
    }

}
