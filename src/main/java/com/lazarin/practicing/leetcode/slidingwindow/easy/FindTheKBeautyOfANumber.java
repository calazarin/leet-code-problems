package com.lazarin.practicing.leetcode.slidingwindow.easy;

//https://leetcode.com/problems/find-the-k-beauty-of-a-number/
public class FindTheKBeautyOfANumber {

    //approach 1 - slide window
    //T: O(n + k) where N is the length of num as string
    //S: O(N)
    public int divisorSubstrings(int num, int k) {
        char [] s = String.valueOf(num).toCharArray();
        int count = 0;
        for(int i = 0 ; i<=s.length - k; i++){
            int divisor = getNumber(k,s,i);
            if(divisor != 0 && num%divisor== 0){
                count++;
            }
        }
        return count;
    }

    private int getNumber(int k, char [] s, int start){
        int num = 0;
        while(k >0){
            num = num*10;
            num = (s[start]-'0')+num;
            start++;
            k--;
        }
        return num;
    }

    //approach 2 - slide window with substring
    public int divisorSubstrings_2(int num, int k) {
        String s = Integer.toString(num);
        String str = "";
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            str = s.substring(i, i + k);
            int n = Integer.parseInt(str);
            if (n != 0 && num % n == 0) {
                count++;
            }
        }
        return count;
    }

    //approach 3 - slide window (a little different)
    public int divisorSubstrings_3(int num, int k) {
        String numStr = String.valueOf(num);

        int i = 0, j = 0, counter = 0;

        while(j < numStr.length()){
            if (j - i == k - 1){
                String sub = numStr.substring(i, j + 1);
                if(Integer.valueOf(sub) != 0 && num % Integer.valueOf(sub) == 0) {
                    counter += 1;
                }
                i += 1;
            }
            j += 1;
        }
        return counter;
    }
}
