package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountAndSay}
 */
public class CountAndSayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CountAndSay countAndSay = new CountAndSay();

        //Explanation: This is the base case
        assertThat(countAndSay.countAndSay(1),is("1"));

       /* Explanation:
        countAndSay(1) = "1"
        countAndSay(2) = say "1" = one 1 = "11"
        countAndSay(3) = say "11" = two 1's = "21"
        countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"*/
        assertThat(countAndSay.countAndSay(4),is("1211"));
    }
}
