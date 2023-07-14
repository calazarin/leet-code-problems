package com.lazarin.practicing.leetcode.arrays.medium;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link DecodeString}
 */
public class DecodeStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DecodeString solution = new DecodeString();
        assertThat(solution.decodeString("3[a]2[bc]"), is("aaabcbc"));
        assertThat(solution.decodeString("3[a2[c]]"), is("accaccacc"));
        assertThat(solution.decodeString("2[abc]3[cd]ef"), is("abcabccdcdcdef"));
        assertThat(solution.decodeString("100[leetcode]"), is("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode"));
        assertThat(solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"), is("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"));
    }

}

