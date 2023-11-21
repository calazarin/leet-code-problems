package com.lazarin.practicing.leetcode.tree.medium.trie;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link MapSumPairs}
 */
public class MapSumPairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MapSumPairs.MapSum mapSum = new MapSumPairs().new MapSum();
        mapSum.insert("apple", 3);
        assertThat(mapSum.sum("ap"), is(3));
        mapSum.insert("app", 2);
        assertThat(mapSum.sum("ap"), is(5));
    }
}
