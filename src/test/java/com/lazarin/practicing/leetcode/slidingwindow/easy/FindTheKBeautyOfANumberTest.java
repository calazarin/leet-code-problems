package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link com.lazarin.practicing.leetcode.slidingwindow.easy.FindTheKBeautyOfANumber}
 */
public class FindTheKBeautyOfANumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindTheKBeautyOfANumber solution = new FindTheKBeautyOfANumber();

        assertThat(solution.divisorSubstrings(240, 2), is(2));
        assertThat(solution.divisorSubstrings(430043, 2), is(2));
        assertThat(solution.divisorSubstrings(65, 1), is(1));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        FindTheKBeautyOfANumber solution = new FindTheKBeautyOfANumber();

        assertThat(solution.divisorSubstrings_2(240, 2), is(2));
        assertThat(solution.divisorSubstrings_2(430043, 2), is(2));
        assertThat(solution.divisorSubstrings_2(65, 1), is(1));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        FindTheKBeautyOfANumber solution = new FindTheKBeautyOfANumber();

        assertThat(solution.divisorSubstrings_3(240, 2), is(2));
        assertThat(solution.divisorSubstrings_3(430043, 2), is(2));
        assertThat(solution.divisorSubstrings_3(65, 1), is(1));
    }

}
