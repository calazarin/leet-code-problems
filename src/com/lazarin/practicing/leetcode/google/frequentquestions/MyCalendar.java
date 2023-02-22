package com.lazarin.googlequestions.interviewprocess;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/my-calendar-i/
public class MyCalendar {

    private List<Event> events;

    public MyCalendar() {
        this.events = new ArrayList<>();
    }

    //true if we can book => we dont have double booking
    //otherwise return false
    //half-open interval?
    public boolean book(int start, int end) {

       /* if(events.isEmpty()){
            events.add(new Event(start, end));
            return true;
        }*/

        //events.sort(Comparator.comparingInt(Event::getStart));

        for(Event event : events){
            int eventStart = event.getStart();
            int eventEnd = event.getEnd();

            if(start < eventEnd && eventStart < end){
                return false;
            }
        }
        events.add(new Event(start, end));
        return true;
    }
}
