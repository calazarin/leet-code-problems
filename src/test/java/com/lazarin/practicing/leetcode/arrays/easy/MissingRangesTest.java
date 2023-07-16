package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

/**
 * {@link MissingRanges}
 */
public class MissingRangesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MissingRanges solution = new MissingRanges();

        /*Explanation: The ranges are:
        [2,2] --> "2"
        [4,49] --> "4->49"
        [51,74] --> "51->74"
        [76,99] --> "76->99"*/
        assertThat(solution.findMissingRanges(new int[]{0,1,3,50,75}, 0, 99), hasItems("2","4->49","51->74","76->99"));

        //Explanation: There are no missing ranges since there are no missing numbers
        assertThat(solution.findMissingRanges(new int[]{-1}, -1, -1), is(new ArrayList<>()));
    }

}
