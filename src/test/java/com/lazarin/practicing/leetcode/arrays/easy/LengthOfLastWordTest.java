package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LengthOfLastWord}
 */
public class LengthOfLastWordTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LengthOfLastWord solution = new LengthOfLastWord();

        //Explanation: The last word is "World" with length 5
        assertThat(solution.lengthOfLastWord("Hello World"), is(5));

        //Explanation: The last word is "moon" with length 4
        assertThat(solution.lengthOfLastWord("   fly me   to   the moon  "), is(4));

        //Explanation: The last word is "joyboy" with length 6
        assertThat(solution.lengthOfLastWord("luffy is still joyboy"), is(6));

    }
}
