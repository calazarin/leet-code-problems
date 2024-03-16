package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link BuildAnArrayWithStackOperations}
 */
public class BuildAnArrayWithStackOperationsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        BuildAnArrayWithStackOperations solution = new BuildAnArrayWithStackOperations();
        assertThat(solution.buildArray(new int[]{1,3}, 3), is(Arrays.asList("Push","Push","Pop","Push")));
        assertThat(solution.buildArray(new int[]{1,2,3}, 3), is(Arrays.asList("Push","Push","Push")));
        assertThat(solution.buildArray(new int[]{1,2}, 4), is(Arrays.asList("Push","Push")));
        assertThat(solution.buildArray(new int[]{2,3,4}, 4), is(Arrays.asList("Push","Pop","Push","Push","Push")));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        BuildAnArrayWithStackOperations solution = new BuildAnArrayWithStackOperations();
        assertThat(solution.buildArray_2(new int[]{1,3}, 3), is(Arrays.asList("Push","Push","Pop","Push")));
        assertThat(solution.buildArray_2(new int[]{1,2,3}, 3), is(Arrays.asList("Push","Push","Push")));
        assertThat(solution.buildArray_2(new int[]{1,2}, 4), is(Arrays.asList("Push","Push")));
        assertThat(solution.buildArray_2(new int[]{2,3,4}, 4), is(Arrays.asList("Push","Pop","Push","Push","Push")));
    }
}
