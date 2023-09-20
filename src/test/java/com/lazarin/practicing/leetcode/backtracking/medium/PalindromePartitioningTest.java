package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.hamcrest.Matchers.containsInAnyOrder;

import static org.hamcrest.MatcherAssert.assertThat;
/**
 * {@link PalindromePartitioning}
 */
public class PalindromePartitioningTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        PalindromePartitioning solution = new PalindromePartitioning();

        assertThat(solution.partition("aab"), containsInAnyOrder(Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")));

        assertThat(solution.partition("a"), containsInAnyOrder(Arrays.asList("a")));

    }

}
