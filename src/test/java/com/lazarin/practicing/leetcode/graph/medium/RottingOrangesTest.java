package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RottingOranges}
 */
public class RottingOrangesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        RottingOranges solution = new RottingOranges();

        assertThat(solution.orangesRotting(new int[][]{{2,1,1}, {1,1,0}, {0,1,1} }), is(4));

        assertThat(solution.orangesRotting(new int[][]{{2,1,1}, {0,1,1}, {1,0,1} }), is(-1));

        assertThat(solution.orangesRotting(new int[][]{ {0,2} }), is(0));

        assertThat(solution.orangesRotting(new int[][]{ {1} }), is(-1));

        assertThat(solution.orangesRotting(new int[][]{ {2,1,1}, {1,1,1}, {0,1,2} }), is(2));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        RottingOranges solution = new RottingOranges();

        assertThat(solution.orangesRotting2(new int[][]{{2,1,1}, {1,1,0}, {0,1,1} }), is(4));

        assertThat(solution.orangesRotting2(new int[][]{{2,1,1}, {0,1,1}, {1,0,1} }), is(-1));

        assertThat(solution.orangesRotting2(new int[][]{ {0,2} }), is(0));

        assertThat(solution.orangesRotting2(new int[][]{ {1} }), is(-1));

    }

}
