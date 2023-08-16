package com.lazarin.learning.leetcode.binary.practing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindTheNumberOf1s}
 */
public class FindTheNumberOf1sTest {

    //https://youtu.be/8iWIpkFgZ64
    @Test
    public void shouldFindTheNumberOf1s(){
        FindTheNumberOf1s solution = new FindTheNumberOf1s();
        //solution:
        //look to the lowest bit and shift the number to right
        //T: O(log(x)) where x is the number of bits to represent a number
        assertThat(solution.ones(2), is(1));
        assertThat(solution.ones(3), is(2));
        assertThat(solution.ones(5), is(2));
        assertThat(solution.ones(7), is(3));
    }
}
