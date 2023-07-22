package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
/**
 * {@link DeleteTheMiddleNodeOfaLinkedList}
 */
public class DeleteTheMiddleNodeOfaLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        DeleteTheMiddleNodeOfaLinkedList solution =
                new DeleteTheMiddleNodeOfaLinkedList();

        ListNode head = ListNode.createList(new int[]{1,3,4,7,1,2,6}, 0);
        ListNode expected = ListNode.createList(new int[]{1,3,4,1,2,6}, 0);
        assertThat(solution.deleteMiddle(head), equalTo(expected));

        ListNode head2 = ListNode.createList(new int[]{1,2,3,4}, 0);
        ListNode expected2 = ListNode.createList(new int[]{1,2,4}, 0);
        assertThat(solution.deleteMiddle(head2), equalTo(expected2));

        ListNode head3 = ListNode.createList(new int[]{2,1}, 0);
        ListNode expected3 = ListNode.createList(new int[]{2}, 0);
        assertThat(solution.deleteMiddle(head3), equalTo(expected3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        DeleteTheMiddleNodeOfaLinkedList solution =
                new DeleteTheMiddleNodeOfaLinkedList();

        ListNode head = ListNode.createList(new int[]{1,3,4,7,1,2,6}, 0);
        ListNode expected = ListNode.createList(new int[]{1,3,4,1,2,6}, 0);
        assertThat(solution.deleteMiddle2(head), equalTo(expected));

        ListNode head2 = ListNode.createList(new int[]{1,2,3,4}, 0);
        ListNode expected2 = ListNode.createList(new int[]{1,2,4}, 0);
        assertThat(solution.deleteMiddle2(head2), equalTo(expected2));

        ListNode head3 = ListNode.createList(new int[]{2,1}, 0);
        ListNode expected3 = ListNode.createList(new int[]{2}, 0);
        assertThat(solution.deleteMiddle2(head3), equalTo(expected3));
    }

}
