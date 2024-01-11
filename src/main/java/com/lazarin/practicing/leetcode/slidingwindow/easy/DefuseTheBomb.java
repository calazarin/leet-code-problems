package com.lazarin.practicing.leetcode.slidingwindow.easy;

//https://leetcode.com/problems/defuse-the-bomb/
public class DefuseTheBomb {

    //approach 1
    //T: O(N * K)
    //S: O (N)
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                result[i] = sum;
            }
        } else if (k == 0) {
            return result;
        } else {
            for (int i = 0; i < n; i++) {
                int sum = 0;

                for (int j = -1; j >= k; j--) {
                    int index = (i + j) % n;
                    if(index < 0) {
                        index = n + index;
                    }
                    sum += code[index];
                }
                result[i] = sum;
            }
        }

        return result;
    }

    /* approach - sliding window with size K
     * T: O(N)
     * S: O(N)
     */
    public int[] decrypt_2(int[] code, int k) {

        int[] decrypted = new int[code.length];

        if(k == 0) {
            return decrypted;
        } else if(k > 0) {
            int sum = 0;
            //if k > 0, the sum will be k values after last value
            for(int i = 1; i <= k; i++){
                sum += code[i];
            }
            decrypted[0] = sum;
            int end = k;

            //iterate through array and adjust the sum adding the next value
            //and subtracting the value that should not be in the window
            for(int i = 1; i < code.length; i++) {
                end = i + k;
                if(end < code.length - 1) {
                    end = (i + k) - code.length;
                }
                sum -= code[i];
                sum += code[end];
                decrypted[i] = sum;
            }

        } else {
            //if k > 0, the sum will be k values after last value
            int sum = 0;
            for(int i = code.length - 2; i >= code.length - 1 + k; i--){
                sum += code[i];
            }
            decrypted[code.length - 1] = sum;
            for(int i = code.length - 2; i >= 0; i--) {
                int index = i + k;
                if(index < 0) {
                    index = code.length + (i + k);
                }
                decrypted[i] = decrypted[i + 1] - code[i] + code[index];
            }
        }

        return decrypted;
    }
}
