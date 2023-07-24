package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SortList}
 */
public class SortListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SortList solution = new SortList();

        ListNode input = ListNode.createList(new int[]{4,2,1,3}, 0);
        ListNode expected = ListNode.createList(new int[]{1,2,3,4}, 0);
        assertThat(solution.sortList(input), is(expected));

        ListNode input2 = ListNode.createList(new int[]{-1,5,3,4,0}, 0);
        ListNode expected2 = ListNode.createList(new int[]{-1,0,3,4,5}, 0);
        assertThat(solution.sortList(input2), is(expected2));
    }

}
