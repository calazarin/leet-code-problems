package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AsteroidCollisionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        AsteroidCollision solution = new AsteroidCollision();

        assertThat(solution.asteroidCollision(new int[]{5,10,-5}), is(new int[]{5,10}));
        assertThat(solution.asteroidCollision(new int[]{-8,8}), is(new int[]{-8,8}));
        assertThat(solution.asteroidCollision(new int[]{10,2,-5}), is(new int[]{10}));
        assertThat(solution.asteroidCollision(new int[]{-2,-2,1,-2}), is(new int[]{-2,-2,-2}));
        assertThat(solution.asteroidCollision(new int[]{1,-2,-2,-2}), is(new int[]{-2,-2,-2}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        AsteroidCollision solution = new AsteroidCollision();

        assertThat(solution.asteroidCollision2(new int[]{5,10,-5}), is(new int[]{5,10}));
        assertThat(solution.asteroidCollision2(new int[]{-8,8}), is(new int[]{-8,8}));
        assertThat(solution.asteroidCollision2(new int[]{10,2,-5}), is(new int[]{10}));
        assertThat(solution.asteroidCollision2(new int[]{-2,-2,1,-2}), is(new int[]{-2,-2,-2}));
        assertThat(solution.asteroidCollision2(new int[]{1,-2,-2,-2}), is(new int[]{-2,-2,-2}));
    }
}
