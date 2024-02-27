package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link GroupThePeopleGivenTheGroupSizeTheyBelongTo}
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        GroupThePeopleGivenTheGroupSizeTheyBelongTo
                solution = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();

        List<List<Integer>> expectedAns1 = new ArrayList<>();
        expectedAns1.add(List.of(0,1,2));
        expectedAns1.add(List.of(5));
        expectedAns1.add(List.of(3,4,6));

        assertThat(solution.groupThePeople(new int[]{3,3,3,3,3,1,3}), is(expectedAns1));

        List<List<Integer>> expectedAns2 = new ArrayList<>();
        expectedAns2.add(List.of(1));
        expectedAns2.add(List.of(0,5));
        expectedAns2.add(List.of(2,3,4));

        assertThat(solution.groupThePeople(new int[]{2,1,3,3,3,2}), is(expectedAns2));

    }
}
