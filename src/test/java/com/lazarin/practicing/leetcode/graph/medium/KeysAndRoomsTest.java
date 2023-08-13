package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link KeysAndRooms}
 */
public class KeysAndRoomsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        KeysAndRooms solution = new KeysAndRooms();

        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1));
        input.add(Arrays.asList(2));
        input.add(Arrays.asList(3));
        input.add(new ArrayList<>());

        assertThat(solution.canVisitAllRooms(input), is(true));

        List<List<Integer>> input2 = new ArrayList<>();
        input2.add(Arrays.asList(1, 3));
        input2.add(Arrays.asList(3, 0, 1));
        input2.add(Arrays.asList(2));
        input2.add(Arrays.asList(0));

        assertThat(solution.canVisitAllRooms(input2), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        KeysAndRooms solution = new KeysAndRooms();

        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1));
        input.add(Arrays.asList(2));
        input.add(Arrays.asList(3));
        input.add(new ArrayList<>());

        assertThat(solution.canVisitAllRooms2(input), is(true));

        List<List<Integer>> input2 = new ArrayList<>();
        input2.add(Arrays.asList(1, 3));
        input2.add(Arrays.asList(3, 0, 1));
        input2.add(Arrays.asList(2));
        input2.add(Arrays.asList(0));

        assertThat(solution.canVisitAllRooms2(input2), is(false));
    }
}
