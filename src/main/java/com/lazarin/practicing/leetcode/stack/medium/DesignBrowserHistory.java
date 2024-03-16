package com.lazarin.practicing.leetcode.stack.medium;

import java.util.Stack;

//https://leetcode.com/problems/design-browser-history/description/
public class DesignBrowserHistory {

    //approach 1 - use 2 stack to visited and forward pages
    class BrowserHistory {
        private Stack<String> visitedStack = new Stack<>();
        private Stack<String> forwardStack = new Stack<>();

        public BrowserHistory(String homepage) {
            visitedStack.push(homepage);
        }

        public void visit(String url) {
            //visits a url and clear all forward history
            visitedStack.push(url);
            forwardStack.clear();
        }

        public String back(int steps) {
            while(visitedStack.size() > 1 && steps > 0){
                forwardStack.push(visitedStack.pop());
                steps--;
            }
            return visitedStack.peek();
        }

        public String forward(int steps) {
            while(!forwardStack.isEmpty() && steps > 0) {
                visitedStack.push(forwardStack.pop());
                steps--;
            }
            return visitedStack.peek();
        }
    }

    //approach 2 - linked list
    class BrowserHistory2 {
        Node home;
        Node curr;

        public BrowserHistory2(String homepage) {
            home = new Node(homepage);
            curr = home;
        }

        public void visit(String url) {
            curr.next = null;
            Node newVisit = new Node(url);
            curr.next = newVisit;
            newVisit.prev = curr;
            curr = newVisit;
        }

        public String back(int steps) {
            while(curr.prev != null && steps > 0){
                curr = curr.prev;
                steps--;
            }
            return curr.val;
        }

        public String forward(int steps) {
            while(curr.next != null && steps > 0){
                curr = curr.next;
                steps--;
            }
            return curr.val;
        }
    }

    class Node{
        String val;
        Node next,prev;
        public Node(String val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
