package com.lazarin.practicing.leetcode.backtracking.medium;

//https://leetcode.com/problems/fair-distribution-of-cookies/description/
public class FairDistributionOfCookies {

    public static void main(String arg[]){

        FairDistributionOfCookies fdc = new FairDistributionOfCookies();
       /* Input: cookies = [8,15,10,20,8], k = 2
        Output: 31
        Explanation: One optimal distribution is [8,15,8] and [10,20]
        - The 1st child receives [8,15,8] which has a total of 8 + 15 + 8 = 31 cookies.
                - The 2nd child receives [10,20] which has a total of 10 + 20 = 30 cookies.
                The unfairness of the distribution is max(31,30) = 31.
        It can be shown that there is no distribution with an unfairness less than 31.*/
        System.out.println(fdc.distributeCookies(new int[]{8,15,10,20,8}, 2));

       /* Input: cookies = [6,1,3,2,2,4,1,2], k = 3
        Output: 7
        Explanation: One optimal distribution is [6,1], [3,2,2], and [4,1,2]
        - The 1st child receives [6,1] which has a total of 6 + 1 = 7 cookies.
                - The 2nd child receives [3,2,2] which has a total of 3 + 2 + 2 = 7 cookies.
                - The 3rd child receives [4,1,2] which has a total of 4 + 1 + 2 = 7 cookies.
                The unfairness of the distribution is max(7,7,7) = 7.
        It can be shown that there is no distribution with an unfairness less than 7.*/
        System.out.println(fdc.distributeCookies(new int[]{8,15,10,20,8}, 2));

    }

    int answer = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {

        backtracking(cookies, 0, k, new int[k]);
        return answer;
    }

    private void backtracking(int[] cookies, int index, int k, int[] cookiesDistribution){
        if(index == cookies.length){
            int max = 0;
            for(int cookie : cookiesDistribution){
                max = Math.max(max, cookie);
            }
            answer = Math.min(answer, max);
        }

        for(int i = 0; i < k; i++){
            cookiesDistribution[i] += cookies[index];
            backtracking(cookies, index + 1, k, cookiesDistribution);
            cookiesDistribution[i] -= cookies[index];
        }
    }

}
