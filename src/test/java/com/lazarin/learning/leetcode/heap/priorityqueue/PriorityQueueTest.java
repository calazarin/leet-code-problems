package com.lazarin.learning.leetcode.heap.priorityqueue;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.PriorityQueue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PriorityQueueTest {

    @Test
    public void testPriorityQueueReverseOrder(){

        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        maxPriorityQueue.add(1);
        maxPriorityQueue.add(2);
        maxPriorityQueue.add(3);

        assertThat(maxPriorityQueue.poll(),is(3));
        assertThat(maxPriorityQueue.poll(),is(2));
        assertThat(maxPriorityQueue.poll(),is(1));
    }

    @Test
    public void testPriorityQueueDefaultOrder(){

        PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>();

        minPriorityQueue.add(1);
        minPriorityQueue.add(2);
        minPriorityQueue.add(3);

        assertThat(minPriorityQueue.poll(),is(1));
        assertThat(minPriorityQueue.poll(),is(2));
        assertThat(minPriorityQueue.poll(),is(3));
   }
}
