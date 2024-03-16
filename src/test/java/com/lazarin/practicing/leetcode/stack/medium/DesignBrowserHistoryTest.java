package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link DesignBrowserHistory}
 */
public class DesignBrowserHistoryTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        DesignBrowserHistory.BrowserHistory solution = new DesignBrowserHistory().new BrowserHistory("leetcode.com");
        solution.visit("google.com");
        solution.visit("facebook.com");
        solution.visit("youtube.com");
        assertThat(solution.back(1), is(("facebook.com")));
        assertThat(solution.back(1), is(("google.com")));
        assertThat(solution.forward(1), is(("facebook.com")));
        solution.visit("linkedin.com");
        assertThat(solution.forward(2), is(("linkedin.com")));
        assertThat(solution.back(2), is(("google.com")));
        assertThat(solution.back(7), is(("leetcode.com")));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        DesignBrowserHistory.BrowserHistory2 solution = new DesignBrowserHistory().new BrowserHistory2("leetcode.com");
        solution.visit("google.com");
        solution.visit("facebook.com");
        solution.visit("youtube.com");
        assertThat(solution.back(1), is(("facebook.com")));
        assertThat(solution.back(1), is(("google.com")));
        assertThat(solution.forward(1), is(("facebook.com")));
        solution.visit("linkedin.com");
        assertThat(solution.forward(2), is(("linkedin.com")));
        assertThat(solution.back(2), is(("google.com")));
        assertThat(solution.back(7), is(("leetcode.com")));
    }
}
