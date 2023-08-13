package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CourseSchedule}
 */
public class CourseScheduleTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        CourseSchedule solution = new CourseSchedule();
        assertThat(solution.canFinish(4, new int[][]{{0,1}, {0,2}, {0,3}, {2,3}}), is(true));
        assertThat(solution.canFinish(2, new int[][]{{1,0}}), is(true));
        assertThat(solution.canFinish(2, new int[][]{{1,0}, {0,1}}), is(false));
    }

}
