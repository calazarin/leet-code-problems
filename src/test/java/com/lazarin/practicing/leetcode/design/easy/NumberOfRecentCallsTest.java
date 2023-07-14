package com.lazarin.practicing.leetcode.design.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.in;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfRecentCalls}
 */
public class NumberOfRecentCallsTest {

    @Test
    public void shouldReturnExpectedAnswers_test1() {

        List<Integer> answers = new ArrayList<>();
        List<Integer> input = Arrays.asList(1,100, 3001, 3002);

        NumberOfRecentCalls solution = new NumberOfRecentCalls();
        input.forEach(i -> answers.add(solution.ping(i)));

        assertThat(answers, is(Arrays.asList(1,2,3,3)));
    }

    @Test
    public void shouldReturnExpectedAnswers_test2() {

        List<Integer> answers = new ArrayList<>();
        List<Integer> input = Arrays.asList(642,1849,4921,5936,5957);

        NumberOfRecentCalls solution = new NumberOfRecentCalls();
        input.forEach(i -> answers.add(solution.ping(i)));

        assertThat(answers, is(Arrays.asList(1,2,1,2,3)));
    }
}
