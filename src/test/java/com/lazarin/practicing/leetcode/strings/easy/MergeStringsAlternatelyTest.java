package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MergeStringsAlternately}
 */
public class MergeStringsAlternatelyTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        MergeStringsAlternately solution = new MergeStringsAlternately();
        assertThat(solution.mergeAlternately("abc","pqr"), is("aqbqcr"));
        assertThat(solution.mergeAlternately("ab","pqrs"), is("apbqrs"));
        assertThat(solution.mergeAlternately("abcd","pq"), is("apbqcd"));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        MergeStringsAlternately solution = new MergeStringsAlternately();
        assertThat(solution.mergeAlternately_2("abc","pqr"), is("aqbqcr"));
        assertThat(solution.mergeAlternately_2("ab","pqrs"), is("apbqrs"));
        assertThat(solution.mergeAlternately_2("abcd","pq"), is("apbqcd"));
    }
}
