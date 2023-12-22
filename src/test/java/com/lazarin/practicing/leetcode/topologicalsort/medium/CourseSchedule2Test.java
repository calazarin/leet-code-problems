package com.lazarin.practicing.leetcode.topologicalsort.medium;

import com.lazarin.practicing.leetcode.topologicalsort.medium.CourseSchedule2;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CourseSchedule2}
 */
public class CourseSchedule2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        CourseSchedule2 solution = new CourseSchedule2();

        /* Input: numCourses = 2, prerequisites = [[1,0]]
        Output: [0,1]
        Explanation: There are a total of 2 courses to take. To take course 1 you
        should have finished course 0. So the correct course order is [0,1].*/
        var resp = solution.findOrder(2, new int[][]{{1, 0}});
        assertThat(resp,  is(new int[]{0,1}));

       /* Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
        Output: [0,2,1,3]
        Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
        So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].*/
        var resp2 = solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        assertThat(resp2, is(new int[]{0,1,2,3}));
    }
}
