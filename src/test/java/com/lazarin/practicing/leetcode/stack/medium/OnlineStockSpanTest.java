package com.lazarin.practicing.leetcode.stack.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link OnlineStockSpanTest}
 */
public class OnlineStockSpanTest {

    @Test
    public void shouldReturnExpectedAnswers_test1() {
        OnlineStockSpan.StockSpanner solution = new OnlineStockSpan().new StockSpanner();

        assertThat(solution.next(100), is(1));
        assertThat(solution.next(80), is(1));
        assertThat(solution.next(60), is(1));
        assertThat(solution.next(70), is(2));
        assertThat(solution.next(60), is(1));
        assertThat(solution.next(75), is(4));
        assertThat(solution.next(85), is(6));
    }

    @Test
    public void shouldReturnExpectedAnswers_test2() {
        OnlineStockSpan.StockSpanner solution = new OnlineStockSpan().new StockSpanner();

        assertThat(solution.next(85), is(1));
        assertThat(solution.next(76), is(1));
        assertThat(solution.next(43), is(1));
        assertThat(solution.next(26), is(1));
        assertThat(solution.next(52), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_test3() {
        OnlineStockSpan.StockSpanner solution = new OnlineStockSpan().new StockSpanner();

        assertThat(solution.next(28), is(1));
        assertThat(solution.next(14), is(1));
        assertThat(solution.next(28), is(3));
        assertThat(solution.next(35), is(4));
        assertThat(solution.next(46), is(5));
        assertThat(solution.next(53), is(6));
        assertThat(solution.next(66), is(7));
        assertThat(solution.next(80), is(8));
        assertThat(solution.next(87), is(9));
        assertThat(solution.next(88), is(10));
    }
}
