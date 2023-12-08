package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link EncodeAndDecodeStrings}
 */
public class EncodeAndDecodeStringsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        EncodeAndDecodeStrings.Codec encoder = new EncodeAndDecodeStrings().new Codec();
        String msg = encoder.encode(Arrays.asList("Hello","World"));
        List<String> strsList = encoder.decode(msg);
        assertThat(strsList, is(Arrays.asList("Hello","World")));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        EncodeAndDecodeStrings.Codec_2 encoder = new EncodeAndDecodeStrings().new Codec_2();
        String msg = encoder.encode(Arrays.asList("Hello","World"));
        assertThat(msg, is("5#Hello5#World"));
        List<String> strsList = encoder.decode(msg);
        assertThat(strsList, is(Arrays.asList("Hello","World")));
    }
}
