package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

/**
 * {@link GroupAnagrams}
 */
public class GroupAnagramsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        GroupAnagrams solution = new GroupAnagrams();
        List<List<String>> resp = solution.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        assertThat(resp, hasItems(Arrays.asList("eat","tea","ate"), Arrays.asList("bat"), Arrays.asList("tan","nat")));
    }
}
