package com.lazarin.practicing.leetcode.graph.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EvaluateDivisionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1_testcase1(){

        EvaluateDivision solution = new EvaluateDivision();

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));
        equations.add(Arrays.asList("b","c"));

        double[] values = {2.0, 3.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("b","a"));
        queries.add(Arrays.asList("a","e"));
        queries.add(Arrays.asList("a","a"));
        queries.add(Arrays.asList("x","x"));

        double[] answer = solution.calcEquation(equations, values, queries);

        assertThat(answer.length, is(5));
        assertThat(answer[0], is(6.00000));
        assertThat(answer[1], is(0.50000));
        assertThat(answer[2], is(-1.00000));
        assertThat(answer[3], is(1.00000));
        assertThat(answer[4], is(-1.00000));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach1_testcase2(){

        EvaluateDivision solution = new EvaluateDivision();

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));
        equations.add(Arrays.asList("b","c"));
        equations.add(Arrays.asList("bc","cd"));

        double[] values = {1.5, 2.5, 5.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("c","b"));
        queries.add(Arrays.asList("bc","cd"));
        queries.add(Arrays.asList("cd","bc"));

        double[] answer = solution.calcEquation(equations, values, queries);

        assertThat(answer.length, is(4));
        assertThat(answer[0], is(3.75000));
        assertThat(answer[1], is(0.40000));
        assertThat(answer[2], is(5.00000));
        assertThat(answer[3], is(0.20000));

    }


    @Test
    public void shouldReturnExpectedAnswers_approach1_testcase3(){

        EvaluateDivision solution = new EvaluateDivision();

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));

        double[] values = {0.5};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a","b"));
        queries.add(Arrays.asList("b","a"));
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("x","y"));

        double[] answer = solution.calcEquation(equations, values, queries);

        assertThat(answer.length, is(4));
        assertThat(answer[0], is(0.50000));
        assertThat(answer[1], is(2.00000));
        assertThat(answer[2], is(-1.00000));
        assertThat(answer[3], is(-1.00000));

    }
}
