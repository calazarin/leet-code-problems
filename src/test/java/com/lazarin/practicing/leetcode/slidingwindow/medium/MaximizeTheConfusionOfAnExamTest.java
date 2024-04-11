package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximizeTheConfusionOfAnExam}
 */
public class MaximizeTheConfusionOfAnExamTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximizeTheConfusionOfAnExam solution = new MaximizeTheConfusionOfAnExam();

        assertThat(solution.maxConsecutiveAnswers("TTFF", 2), is(4));
        assertThat(solution.maxConsecutiveAnswers("TFFT", 1), is(3));
        assertThat(solution.maxConsecutiveAnswers("TTFTTFTT", 1), is(5));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MaximizeTheConfusionOfAnExam solution = new MaximizeTheConfusionOfAnExam();

        assertThat(solution.maxConsecutiveAnswers_2("TTFF", 2), is(4));
        assertThat(solution.maxConsecutiveAnswers_2("TFFT", 1), is(3));
        assertThat(solution.maxConsecutiveAnswers_2("TTFTTFTT", 1), is(5));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        MaximizeTheConfusionOfAnExam solution = new MaximizeTheConfusionOfAnExam();

        assertThat(solution.maxConsecutiveAnswers_3("TTFF", 2), is(4));
        assertThat(solution.maxConsecutiveAnswers_3("TFFT", 1), is(3));
        assertThat(solution.maxConsecutiveAnswers_3("TTFTTFTT", 1), is(5));
    }
}
