package com.lazarin.learning.leetcode.trie.count;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link TrieCounter}
 */
public class TrieCounterTest {

    @Test
    public void shouldCreateAndInsertWordsInTrie(){
        TrieCounter trie = new TrieCounter();
        trie.insert("apple");
        trie.insert("appl");
        trie.insert("apple");
        trie.insert("boot");
        trie.insert("boost");

        assertThat(trie.countWordsEqualTo("apple"), is(2));
        assertThat(trie.countWordsEqualTo("appl"), is(1));
        assertThat(trie.countWordsEqualTo("boot"), is(1));
        assertThat(trie.countWordsEqualTo("boost"), is(1));
        assertThat(trie.countWordsEqualTo("pineapple"), is(0));

        assertThat(trie.countWordsStartingWith("appl"), is(3));
        assertThat(trie.countWordsStartingWith("boo"), is(2));

        trie.erase("apple");

        assertThat(trie.countWordsEqualTo("apple"), is(1));
        assertThat(trie.countWordsStartingWith("appl"), is(2));
    }
}

