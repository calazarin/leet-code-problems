package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Stack;

//https://leetcode.com/problems/asteroid-collision
public class AsteroidCollision {

    //T: O(N)
    //S: O(N)
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);

        for(int i = 1; i < asteroids.length; i++){
            int newStone = asteroids[i];
            int earlierStone = stack.peek();
            boolean skip = false;
            while(conflict(earlierStone,newStone)){
                if(Math.abs(newStone) > earlierStone) stack.pop();
                if(Math.abs(newStone) < earlierStone) {
                    skip = true;
                    break;
                }
                if(Math.abs(newStone) == earlierStone){
                    stack.pop();
                    skip = true;
                    break;
                }
                if(stack.isEmpty()){
                    break;
                }
                earlierStone = stack.peek();
            }
            if(!skip){
                stack.push(newStone);
            }
        }

        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }

        return res;
    }

    private boolean conflict(int top, int number){
        return top > 0 && number < 0;
    }

    //T: O(N)
    //S: O(N)
    public int[] asteroidCollision2(int[] asteroids) {

        Stack<Integer> st = new Stack<Integer>();

        for (int asteroid : asteroids) {
            boolean flag = true;
            while (!st.isEmpty() && (st.peek() > 0 && asteroid < 0)) {
                // If the top asteroid in the stack is smaller, then it will explode.
                // Hence, pop it from the stack, also continue with the next asteroid in the stack.
                if (Math.abs(st.peek()) < Math.abs(asteroid)) {
                    st.pop();
                    continue;
                }
                // If both asteroids have the same size, then both asteroids will explode.
                // Pop the asteroid from the stack; also, we won't push the current asteroid to the stack.
                else if (Math.abs(st.peek()) == Math.abs(asteroid)) {
                    st.pop();
                }

                // If we reach here, the current asteroid will be destroyed
                // Hence, we should not add it to the stack
                flag = false;
                break;
            }

            if (flag) {
                st.push(asteroid);
            }
        }

        // Add the asteroids from the stack to the vector in the reverse order.
        int[] remainingAsteroids = new int[st.size()];
        for (int i = remainingAsteroids.length - 1; i >= 0; i--) {
            remainingAsteroids[i] = st.peek();
            st.pop();
        }

        return remainingAsteroids;

    }
}
