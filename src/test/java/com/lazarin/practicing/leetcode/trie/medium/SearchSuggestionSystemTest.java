package com.lazarin.practicing.leetcode.trie.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * {@link SearchSuggestionSystem}
 */
public class SearchSuggestionSystemTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SearchSuggestionSystem searchSuggestionSystem =
            new SearchSuggestionSystem();

        var resp = searchSuggestionSystem.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse");
        assertThat(resp,
                contains(
                        Arrays.asList("mobile","moneypot","monitor"),
                        Arrays.asList("mobile","moneypot","monitor"),
                        Arrays.asList("mouse","mousepad"),
                        Arrays.asList("mouse","mousepad"),
                        Arrays.asList("mouse","mousepad")
                ));

        var resp2 = searchSuggestionSystem.suggestedProducts_2(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse");
        assertThat(resp2,
                contains(
                        Arrays.asList("mobile","moneypot","monitor"),
                        Arrays.asList("mobile","moneypot","monitor"),
                        Arrays.asList("mouse","mousepad"),
                        Arrays.asList("mouse","mousepad"),
                        Arrays.asList("mouse","mousepad")
                        ));

       /* Input: products = ["havana"], searchWord = "havana"
        Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]*/
    }
}
