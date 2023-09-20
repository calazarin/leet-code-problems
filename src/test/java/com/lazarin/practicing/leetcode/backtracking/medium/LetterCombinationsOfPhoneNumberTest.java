package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link LetterCombinationsOfPhoneNumber}
 */
public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();

        assertThat(solution.letterCombinations("23"), is(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")));
        assertThat(solution.letterCombinations(""), is(new ArrayList<>()));
        assertThat(solution.letterCombinations("2"), is(Arrays.asList("a","b","c")));

        assertThat(solution.letterCombinations("234"), is(Arrays.asList(
                "adg","adh","adi","aeg","aeh","aei","afg","afh","afi",
                "bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi",
                "cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi")));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();

        assertThat(solution.letterCombinations2("23"), is(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")));
        assertThat(solution.letterCombinations2(""), is(new ArrayList<>()));
        assertThat(solution.letterCombinations2("2"), is(Arrays.asList("a","b","c")));

        assertThat(solution.letterCombinations2("234"), is(Arrays.asList(
                "adg","adh","adi","aeg","aeh","aei","afg","afh","afi",
                "bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi",
                "cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi")));
    }
}
