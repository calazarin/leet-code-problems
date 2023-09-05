package com.lazarin.learning.leetcode.heap.minheap;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MinHeap}
 */
public class MinHeapTest {

    @Test
    public void shouldReturnElementInProperOrder(){
        MinHeap minHeap = new MinHeap(5);
        minHeap.insert(8);
        minHeap.insert(5);
        minHeap.insert(10);
        minHeap.insert(2);
        assertThat(minHeap.remove(), is(2));
        assertThat(minHeap.remove(), is(5));
        assertThat(minHeap.remove(), is(8));
        assertThat(minHeap.remove(), is(10));
    }
}
