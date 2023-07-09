package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link AddStrings}
 */
public class AddStringsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        AddStrings solution = new AddStrings();

        assertThat(solution.addStrings("11", "123"), is("134"));
        assertThat(solution.addStrings("456", "77"), is("533"));
        assertThat(solution.addStrings("0", "0"), is("0"));

    }

}
