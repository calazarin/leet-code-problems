package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MeetingRooms2}
 */
public class MeetingRooms2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MeetingRooms2 solution = new MeetingRooms2();
        assertThat(solution.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}),
                is(2));

        assertThat(solution.minMeetingRooms(new int[][]{{7,10},{2,4}}),
                is(1));
    }
}
