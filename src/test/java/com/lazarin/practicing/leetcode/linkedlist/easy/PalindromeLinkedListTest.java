package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link com.lazarin.practicing.leetcode.linkedlist.easy.PalindromeLinkedList}
 */
public class PalindromeLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswers_test_approach1() {

        PalindromeLinkedList solution = new PalindromeLinkedList();

        ListNode input = ListNode.createList(new int[]{1,2,2,1}, 0);
        boolean output = solution.isPalindrome(input);
        assertThat(output, is(true));

        ListNode input2 = ListNode.createList(new int[]{1,2}, 0);
        boolean output2 = solution.isPalindrome(input2);
        assertThat(output2, is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_test_approach2() {

        PalindromeLinkedList solution = new PalindromeLinkedList();

        ListNode input = ListNode.createList(new int[]{1,2,2,1}, 0);
        boolean output = solution.isPalindrome(input);
        assertThat(output, is(true));

        ListNode input2 = ListNode.createList(new int[]{1,2}, 0);
        boolean output2 = solution.isPalindrome(input2);
        assertThat(output2, is(false));

    }
}
