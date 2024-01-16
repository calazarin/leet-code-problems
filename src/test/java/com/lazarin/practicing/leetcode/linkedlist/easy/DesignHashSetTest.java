package com.lazarin.practicing.leetcode.linkedlist.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link DesignHashSet}
 */
public class DesignHashSetTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        DesignHashSet.MyHashSet solution = new DesignHashSet().new MyHashSet();
        solution.add(1);
        solution.add(2);
        assertThat(solution.contains(1), is(true));
        assertThat(solution.contains(3), is(false));
        solution.add(2);
        assertThat(solution.contains(2), is(true));
        solution.remove(2);
        assertThat(solution.contains(2), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        DesignHashSet.MyHashSet2 solution = new DesignHashSet().new MyHashSet2();
        solution.add(1);
        solution.add(2);
        assertThat(solution.contains(1), is(true));
        assertThat(solution.contains(3), is(false));
        solution.add(2);
        assertThat(solution.contains(2), is(true));
        solution.remove(2);
        assertThat(solution.contains(2), is(false));
    }
}
