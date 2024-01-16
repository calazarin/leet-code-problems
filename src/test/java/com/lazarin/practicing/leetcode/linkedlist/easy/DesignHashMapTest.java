package com.lazarin.practicing.leetcode.linkedlist.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link DesignHashMap}
 */
public class DesignHashMapTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        DesignHashMap.MyHashMap solution = new DesignHashMap().new MyHashMap();
        solution.put(1, 1);
        solution.put(2, 2);
        assertThat(solution.get(1), is(1));
        assertThat(solution.get(3), is(-1));
        solution.put(2,1);
        assertThat(solution.get(2), is(1));
        solution.remove(2);
        assertThat(solution.get(2), is(-1));
    }

}
