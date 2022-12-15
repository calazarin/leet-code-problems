package com.lazarin.blindlistandmore.strings.medium;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/encode-and-decode-strings/
public class EncodeAndDecodeStrings {

    public static void main(String args[]){
       /* Input: dummy_input = ["Hello","World"]
        Output: ["Hello","World"]
        Explanation:
        Machine 1:
        Codec encoder = new Codec();
        String msg = encoder.encode(strs);
        Machine 1 ---msg---> Machine 2

        Machine 2:
        Codec decoder = new Codec();
        String[] strs = decoder.decode(msg);
      */

        Codec encoder = new Codec();
        //String msg = encoder.encode(Arrays.asList("Hello","World"));
        String msg = encoder.encode2(Arrays.asList("Hello","World"));

        Codec decoder = new Codec();
        //List<String> strsList = decoder.decode(msg);
        List<String> strsList = decoder.decode2(msg);

        for(String str : strsList){
            System.out.println(str);
        }

    }

}
