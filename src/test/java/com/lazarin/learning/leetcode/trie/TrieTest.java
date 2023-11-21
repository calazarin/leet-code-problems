package com.lazarin.learning.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link Trie}
 */
public class TrieTest {

    @Test
    public void shouldCreateAndInsertWordsInTrie(){
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("appl");
        trie.insert("boot");
        trie.insert("boost");

        assertThat(trie.search("apple"), is(true));
        assertThat(trie.search("appl"), is(true));
        assertThat(trie.search("boot"), is(true));
        assertThat(trie.search("boost"), is(true));
        assertThat(trie.startsWith("boo"), is(true));
        assertThat(trie.startsWith("boa"), is(false));
        assertThat(trie.startsWith("appl"), is(true));
        assertThat(trie.startsWith("aps"), is(false));
    }
}
