package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link Dota2Senate}
 */
public class Dota2SenateTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Dota2Senate solution = new Dota2Senate();

        assertThat(solution.predictPartyVictory("RD"), is("Radiant"));
        assertThat(solution.predictPartyVictory("RDD"), is("Dire"));
        assertThat(solution.predictPartyVictory("DDRRR"), is("Dire"));
    }
}
