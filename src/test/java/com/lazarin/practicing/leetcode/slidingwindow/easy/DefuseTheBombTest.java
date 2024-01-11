package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link DefuseTheBomb}
 */
public class DefuseTheBombTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DefuseTheBomb solution = new DefuseTheBomb();

        assertThat(solution.decrypt(new int[]{5,7,1,4}, 3), is(new int[]{12,10,16,13}));
        assertThat(solution.decrypt(new int[]{1,2,3,4}, 0), is(new int[]{0,0,0,0}));
        assertThat(solution.decrypt(new int[]{2,4,9,3}, -2), is(new int[]{12,5,6,13}));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        DefuseTheBomb solution = new DefuseTheBomb();

        assertThat(solution.decrypt(new int[]{5,7,1,4}, 3), is(new int[]{12,10,16,13}));
        assertThat(solution.decrypt_2(new int[]{1,2,3,4}, 0), is(new int[]{0,0,0,0}));
        assertThat(solution.decrypt_2(new int[]{2,4,9,3}, -2), is(new int[]{12,5,6,13}));

    }
}
