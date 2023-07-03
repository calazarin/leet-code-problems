package com.lazarin.practicing.leetcode.google.frequentquestions;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/minimum-time-difference/
public class MinimumTimeDifference {

    public static void main(String args[]){

        /*Input: timePoints = ["23:59","00:00"]
        Output: 1*/
        System.out.println(findMinDifference2(Arrays.asList("23:59","00:00")));

        /*Input: timePoints = ["00:00","23:59","00:00"]
        Output: 0*/
        System.out.println(findMinDifference2(Arrays.asList("00:00","23:59","00:00")));

    }

    //O(N)
    public static int findMinDifference(List<String> timePoints) {

        boolean[] timeSeen = new boolean[24 * 60]; //1440

        for(String timeStr : timePoints){
            String[] timeSplit = timeStr.split(":");
            int hour = Integer.valueOf(timeSplit[0]);
            int minutes = Integer.valueOf(timeSplit[1]);
            if(timeSeen[(60 * hour) + minutes]) return 0;
            timeSeen[(60 * hour) + minutes] = true;
        }

        Integer firsTimeSeen = null;
        Integer previousTimeSeen = null;
        Integer minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < 1440; i++){

            if(timeSeen[i]){
                if(firsTimeSeen == null){
                    firsTimeSeen = i;
                    previousTimeSeen = i;
                } else {
                    previousTimeSeen = i;
                    minimumDifference = Math.min(
                            minimumDifference,
                            Math.min(i - previousTimeSeen, 1440 - i + previousTimeSeen));
                }
            }

        }

        minimumDifference = Math.min(minimumDifference,
                Math.min(previousTimeSeen - firsTimeSeen, 1440 -  previousTimeSeen + firsTimeSeen));

        return minimumDifference;
    }

    //T: O(N log N)
    //S: O(N)
    public static int findMinDifference2(List<String> timePoints) {

        int[] times = new int[timePoints.size()];

        for(int i  =0 ; i < timePoints.size(); i++){
            String timeStr = timePoints.get(i);
            String[] timeSplit = timeStr.split(":");
            int hours = Integer.valueOf(timeSplit[0]);
            int minutes = Integer.valueOf(timeSplit[1]);

            var min_past_midnight = (hours * 60) + minutes;
            times[i] = min_past_midnight;
        }

        Arrays.sort(times);
        var res = 1440 + times[0] - times[times.length - 1]; //takes care of 00:00
        for(int i = 1; i < timePoints.size(); i++){
            res = Math.min(res, times[i] - times[i - 1]);
        }
        return res;
    }
}
