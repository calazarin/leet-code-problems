package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ShortestDistanceToACharacter}
 */
public class ShortestDistanceToACharacterTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ShortestDistanceToACharacter solution = new ShortestDistanceToACharacter();
        assertThat(solution.shortestToChar("loveleetcode", 'e'), is(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}));
        assertThat(solution.shortestToChar("aaab", 'b'), is(new int[]{3,2,1,0}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        ShortestDistanceToACharacter solution = new ShortestDistanceToACharacter();
        assertThat(solution.shortestToChar_2("loveleetcode", 'e'), is(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}));
        assertThat(solution.shortestToChar_2("aaab", 'b'), is(new int[]{3,2,1,0}));
    }
}