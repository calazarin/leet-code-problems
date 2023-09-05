package com.lazarin.practicing.leetcode.design.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SmallestInfiniteSet}
 */
public class SmallestInfiniteSetTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        SmallestInfiniteSet solution = new SmallestInfiniteSet();
        List<Integer> answer = new ArrayList<>();
        solution.addBack(2);
        answer.add(solution.popSmallest());
        answer.add(solution.popSmallest());
        answer.add(solution.popSmallest());
        solution.addBack(1);
        answer.add(solution.popSmallest());
        answer.add(solution.popSmallest());
        answer.add(solution.popSmallest());

        assertThat(answer, is(Arrays.asList(1,2,3,1,4,5)));

    }
}
