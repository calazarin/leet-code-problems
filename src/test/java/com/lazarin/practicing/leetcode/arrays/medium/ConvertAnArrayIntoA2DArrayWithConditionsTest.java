package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ConvertAnArrayIntoA2DArrayWithConditions}
 */
public class ConvertAnArrayIntoA2DArrayWithConditionsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ConvertAnArrayIntoA2DArrayWithConditions
                solution = new ConvertAnArrayIntoA2DArrayWithConditions();

        List<List<Integer>> expectedAns1 = new ArrayList<>();
        expectedAns1.add(List.of(1,2,3,4));
        expectedAns1.add(List.of(1,3));
        expectedAns1.add(List.of(1));

        assertThat(solution.findMatrix(new int[]{1,3,4,1,2,3,1}),
                is(expectedAns1));

        List<List<Integer>> expectedAns2 = new ArrayList<>();
        expectedAns2.add(List.of(1, 2, 3, 4));

        assertThat(solution.findMatrix(new int[]{1,2,3,4}),
                is(expectedAns2));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ConvertAnArrayIntoA2DArrayWithConditions
                solution = new ConvertAnArrayIntoA2DArrayWithConditions();

        List<List<Integer>> expectedAns1 = new ArrayList<>();
        expectedAns1.add(List.of(1, 3, 4, 2));
        expectedAns1.add(List.of(1,3));
        expectedAns1.add(List.of(1));

        assertThat(solution.findMatrix_2(new int[]{1,3,4,1,2,3,1}),
                is(expectedAns1));

        List<List<Integer>> expectedAns2 = new ArrayList<>();
        expectedAns2.add(List.of(1, 2, 3, 4));

        assertThat(solution.findMatrix_2(new int[]{1,2,3,4}),
                is(expectedAns2));

    }

}
