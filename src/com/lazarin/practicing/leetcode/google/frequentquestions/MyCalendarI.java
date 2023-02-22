package com.lazarin.googlequestions.interviewprocess;

//problem 729
//https://leetcode.com/problems/my-calendar-i/
//medium7
//Google, Uber, Amazon, Twitch
public class MyCalendarI {

    public static void main(String args[]){

        //***********************47-------50**************
        //*****33------41********************
        //**********39********45**************************

        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(47, 50));
        System.out.println(myCalendar.book(33, 41));
        System.out.println(myCalendar.book(39, 45));
        System.out.println(myCalendar.book(33, 42));
        System.out.println(myCalendar.book(25,32));
        System.out.println(myCalendar.book(26,35));
        System.out.println(myCalendar.book(19,25));
        System.out.println(myCalendar.book(3,8));
        System.out.println(myCalendar.book(8,13));
        System.out.println(myCalendar.book(18,27));
    }
}
