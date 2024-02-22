package com.lazarin.practicing.leetcode.greedy.easy;

import com.lazarin.practicing.leetcode.greedy.medium.GasStation;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MinimumCostToMoveChipsToTheSamePosition}
 */
public class MinimumCostToMoveChipsToTheSamePositionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();
        assertThat(solution.minCostToMoveChips(new int[]{1,2,3}), is(1));
        assertThat(solution.minCostToMoveChips(new int[]{2,2,2,3,3}), is(2));
        assertThat(solution.minCostToMoveChips(new int[]{1,1000000000}), is(1));
    }
}
