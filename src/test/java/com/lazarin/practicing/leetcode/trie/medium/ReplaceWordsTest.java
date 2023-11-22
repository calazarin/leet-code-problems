package com.lazarin.practicing.leetcode.trie.medium;

import com.lazarin.practicing.leetcode.trie.medium.ReplaceWords;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ReplaceWords}
 */
public class ReplaceWordsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        ReplaceWords replaceWords = new ReplaceWords();

     /*   assertThat(replaceWords.replaceWords(Arrays.asList("cat","bat","rat"), "the cattle was rattled by the battery"),
                is("the cat was rat by the bat"));

        assertThat(replaceWords.replaceWords(Arrays.asList("a","b","c"), "aadsfasf absbs bbab cadsfafs"),
                is("a a b c"));*/

        assertThat(replaceWords.replaceWords(Arrays.asList("a", "aa", "aaa", "aaaa"),
                        "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"),
                is("a a a a a a a a bbb baba a"));
    }
}
