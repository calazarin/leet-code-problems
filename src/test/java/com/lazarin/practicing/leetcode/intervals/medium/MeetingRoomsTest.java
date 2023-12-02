package com.lazarin.practicing.leetcode.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MeetingRooms}
 */
public class MeetingRoomsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MeetingRooms solution = new MeetingRooms();
        assertThat(solution.canAttendMeetings(new int[][]{ {0,30}, {5,10}, {15,20}}),
                is(false));

        assertThat(solution.canAttendMeetings(new int[][]{ {7,10}, {2,4}}),
                is(true));

        assertThat(solution.canAttendMeetings(new int[][]{ {6,15}, {13,20}, {6,17}}),
                is(false));

    }
}
