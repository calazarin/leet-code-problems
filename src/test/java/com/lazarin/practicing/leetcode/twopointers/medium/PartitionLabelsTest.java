package com.lazarin.practicing.leetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link PartitionLabels}
 */
public class PartitionLabelsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        PartitionLabels solution = new PartitionLabels();

        assertThat(solution.partitionLabels("ababcbacadefegdehijhklij"), is(Arrays.asList(9,7,8)));
        assertThat(solution.partitionLabels("eccbbbbdec"), is(Arrays.asList(10)));
    }
}
