package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * {@link com.lazarin.practicing.leetcode.linkedlist.medium.AddTwoNumbers}
 */
public class AddTwoNumbersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        AddTwoNumbers solution = new AddTwoNumbers();

        ListNode input1 = ListNode.createList(new int[]{2,4,3}, 0);
        ListNode input2 = ListNode.createList(new int[]{5,6,4}, 0);

        ListNode expected = ListNode.createList(new int[]{7,0,8}, 0);

        ListNode output = solution.addTwoNumbers(input1, input2);
        assertThat(output, equalTo(expected));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        AddTwoNumbers solution = new AddTwoNumbers();

        ListNode input1 = ListNode.createList(new int[]{2,4,3}, 0);
        ListNode input2 = ListNode.createList(new int[]{5,6,4}, 0);

        ListNode expected = ListNode.createList(new int[]{7,0,8}, 0);

        ListNode output = solution.addTwoNumbers2(input1, input2);
        assertThat(output, equalTo(expected));
    }
}
