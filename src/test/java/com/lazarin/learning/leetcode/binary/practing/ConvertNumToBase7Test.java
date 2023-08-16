package com.lazarin.learning.leetcode.binary.practing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ConvertNumToBase7}
 */
public class ConvertNumToBase7Test {

    @Test
    public void shouldConvertToBase7(){
        ConvertNumToBase7 convertNumToBase7 = new ConvertNumToBase7();
        assertThat(convertNumToBase7.toBase7(100), is("202"));
        assertThat(convertNumToBase7.toBase7(-7), is("-10"));
    }
}
