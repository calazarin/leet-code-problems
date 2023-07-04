package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SurroundedRegions}
 */
public class SurroundedRegionsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        SurroundedRegions
                solution = new SurroundedRegions();

        char[][] input = new char[][] {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        char[][] expected = new char[][] {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solution.solve(input);
        assertThat(input, is(expected));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        SurroundedRegions
                solution = new SurroundedRegions();

        char[][] input = new char[][] {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        char[][] expected = new char[][] {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solution.solve(input);
        assertThat(input, is(expected));
    }
}
