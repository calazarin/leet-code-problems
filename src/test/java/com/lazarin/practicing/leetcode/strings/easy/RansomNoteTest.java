package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RansomNote}
 */
public class RansomNoteTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        RansomNote solution = new RansomNote();

        assertThat(solution.canConstruct("a","b"), is(false));
        assertThat(solution.canConstruct("aa", "ab"), is(false));
        assertThat(solution.canConstruct("aa","aab"), is(true));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        RansomNote solution = new RansomNote();

        assertThat(solution.canConstruct_2("a","b"), is(false));
        assertThat(solution.canConstruct_2("aa", "ab"), is(false));
        assertThat(solution.canConstruct_2("aa","aab"), is(true));
    }
}
