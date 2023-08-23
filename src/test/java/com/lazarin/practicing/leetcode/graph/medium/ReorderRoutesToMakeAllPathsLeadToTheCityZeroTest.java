package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ReorderRoutesToMakeAllPathsLeadToTheCityZero}
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution =
                new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

        int[][] connections = new int[][]{ {0,1}, {1,3}, {2,3}, {4,0}, {4,5} };

        assertThat(solution.minReorder(6, connections), is(3));

        int[][] connections2 = new int[][]{  {1,0}, {1,2}, {3,2}, {3,4} };

        assertThat(solution.minReorder(5, connections2), is(2));

        int[][] connections3 = new int[][]{ {1,0}, {2,0} };

        assertThat(solution.minReorder(3, connections3), is(0));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution =
                new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

        int[][] connections = new int[][]{ {0,1}, {1,3}, {2,3}, {4,0}, {4,5} };
        assertThat(solution.minReorder2(6, connections), is(3));

        int[][] connections2 = new int[][]{  {1,0}, {1,2}, {3,2}, {3,4} };
        assertThat(solution.minReorder2(5, connections2), is(2));

        int[][] connections3 = new int[][]{ {1,0}, {2,0} };
        assertThat(solution.minReorder2(3, connections3), is(0));

    }

}
