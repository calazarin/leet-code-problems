package com.lazarin.googlequestions.interviewprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/shortest-way-to-form-string/
public class ShortestWayToFormString {

    public static void main(String args[]){

        /*Input: source = "abc", target = "abcbc"
        Output: 2
        Explanation: The target "abcbc" can be formed by "abc" and "bc", which are subsequences of source "abc".*/

        /*Input: source = "abc", target = "acdbc"
        Output: -1
        Explanation: The target string cannot be constructed from the subsequences of source string due to the character "d" in target string.*/

        /*Input: source = "xyz", target = "xzyxz"
        Output: 3
        Explanation: The target string can be constructed as follows "xz" + "y" + "xz".*/
    }

    //Runtime: O(nm), where n and m are sizes of the source and target.
    //Memory: O(1)
    public int shortestWay(String source, String target) {
        int targetIndex = 0;
        int result = 0;

        while(targetIndex < target.length()){

            int temp  = targetIndex;
            for(int sourceIndex = 0; sourceIndex < source.length(); sourceIndex++){
                if(targetIndex < target.length() && source.charAt(sourceIndex) == target.charAt(targetIndex)){
                    targetIndex++;
                }
            }
            if(targetIndex == temp){
                return -1;
            }
            result++;
        }

        return result;
    }

  //  Solution 2: Binary search for each character in target
   // time complexity: O(M*logN)
  public int shortestWay2(String source, String target) {
      Map<Character, ArrayList<Integer>> map = new HashMap();
      for (int i = 0; i < source.length(); i++) {
          char c = source.charAt(i);
          map.putIfAbsent(c, new ArrayList<>());
          map.get(c).add(i);
      }
      int count = 0;
      int i = 0;
      while (i < target.length()) {
          int j = -1;
          while (i < target.length() && findIndex(map.get(target.charAt(i)), j) != -1) {
              j = findIndex(map.get(target.charAt(i)), j);
              i++;
          }
          if (j == -1) {
              return -1;
          } else {
              count++;
          }
      }
      return count;

  }

    private int findIndex(ArrayList<Integer> list, int begin) {
        if (list == null) {
            return -1;
        }
        if (list.size() == 0) {
            return -1;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) > begin) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (list.get(left) > begin) {
            return list.get(left);
        } else {
            return -1;
        }
    }

}
