package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RotateList}
 */
public class RotateListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        RotateList solution = new RotateList();

        ListNode input = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expected = ListNode.createList(new int[]{4,5,1,2,3}, 0);
        assertThat(solution.rotateRight(input, 2), is(expected));

   }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        RotateList solution = new RotateList();

        ListNode input = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expected = ListNode.createList(new int[]{4,5,1,2,3}, 0);
        assertThat(solution.rotateRight2(input, 2), is(expected));

    }
}
