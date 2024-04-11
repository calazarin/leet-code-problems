package com.lazarin.practicing.leetcode.slidingwindow.medium;

//https://leetcode.com/problems/maximize-the-confusion-of-an-exam/description/
public class MaximizeTheConfusionOfAnExam {

    //approach - sliding window
    //T: O(N); S:O(1)
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int considerT = findSeq(answerKey, k, 'T');
        int considerF = findSeq(answerKey, k, 'F');
        return Math.max(considerT, considerF);
    }

    private int findSeq(String s, int k, char letter) {
        int left = 0, right = 0, cnt = 0, ans = 0;
        while(right < s.length()) {
            if(s.charAt(right) == letter) {
                cnt++;
            }
            if(cnt > k){
                if(s.charAt(left) == letter){
                    cnt--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }

    //sliding window, different approach (1 pass)
    public int maxConsecutiveAnswers_2(String answerKey, int k) {
        int a[] = {0, 0};
        int start = 0, end = 0, count = 0;
        while (end < answerKey.length()) {
            if (answerKey.charAt(end) == 'F') {
                a[0] += 1;
            } else {
                a[1] += 1;
            }
            while (Math.min(a[0], a[1]) > k) {
                if (answerKey.charAt(start) == 'F') {
                    a[0] -= 1;
                } else {
                    a[1] -= 1;
                }
                start += 1;
            }
            int count1 = end - start + 1;
            if (count1 > count) count = count1;
            end += 1;
        }
        return count;
    }

    //sliding window (different implementation) - T: O(N); S:O(1)
    public int maxConsecutiveAnswers_3(String answerKey, int k) {
        return Math.max(confusion(answerKey, k, 'T'), confusion(answerKey, k, 'F'));
    }

    private int confusion(String answerKey, int k, char t){
        int left  = 0, res = 0, count = k;
        for(int right = 0; right < answerKey.length(); right++){
           if(answerKey.charAt(right) != t) {
               count--;
           }
           while (count < 0) {
               if(answerKey.charAt(left) != t){
                   count++;
               }
               left++;
           }
           res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
