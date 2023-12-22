package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link KeyboardRow}
 */
public class KeyboardRowTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        KeyboardRow solution = new KeyboardRow();

        assertThat(solution.findWords(new String[]{"Hello","Alaska","Dad","Peace"}),
                is(new String[]{"Alaska","Dad"}));

        assertThat(solution.findWords(new String[]{"omk"}), is(new String[]{}));

        assertThat(solution.findWords(new String[]{"adsdf","sfd"}), is(new String[]{"adsdf","sfd"}));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        KeyboardRow solution = new KeyboardRow();

        assertThat(solution.findWords_2(new String[]{"Hello","Alaska","Dad","Peace"}),
                is(new String[]{"Alaska","Dad"}));

        assertThat(solution.findWords_2(new String[]{"omk"}), is(new String[]{}));

        assertThat(solution.findWords_2(new String[]{"adsdf","sfd"}), is(new String[]{"adsdf","sfd"}));

    }
}
