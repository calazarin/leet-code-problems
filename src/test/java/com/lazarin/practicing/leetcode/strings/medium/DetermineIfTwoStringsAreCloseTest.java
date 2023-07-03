package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link DetermineIfTwoStringsAreClose}
 */
public class DetermineIfTwoStringsAreCloseTest
{
    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();

        assertEquals(solution.closeStrings("abc","bca"), true);
        assertEquals(solution.closeStrings("a","aa"), false);

    }
}
