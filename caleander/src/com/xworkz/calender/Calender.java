package com.xworkz.calender;

import javafx.event.EventType;

import java.lang.reflect.Array;

public class Calender {
    //DataType ref[]=new DataType[Size]
    Events events[] = new Events[3];
    int index;

    public boolean addEvents(Events events) {
        boolean isAdded = false;
        if (events.getEventId() > 0 && events.getEventType() != null && events.getWho() != null && index < this.events.length) {
            this.events[index++] = events;
            isAdded = true;
        } else if (index >= this.events.length) {
            System.out.println("can not add event:the calender is full!!");
        } else
            System.out.println("invalid event data");
        return isAdded;
    }

    public void getAllEvents() {
        System.out.println("get all the events lists");
        for (Events events : events) {
            if (events != null)//to avoid null point exception

                System.out.println("event  id :" + events.getEventId() + " " + "who:" + events.getWho() + " "
                        + "all the event days  :" + events.isAllDayEvent() + "event start date :" +
                        " " + events.getStarDate() + "event end date ; " + "" + events.getEndDate());
        }
    }

    public Events getbyeventid(int id) {
        Events eventsTobeReturned = null;
        System.out.println(" get Event By Id");
//        for (int i = 0; i < events.length; i++) {
//            if (events[i].getEventId() == id) {
        for (Events events : events) {
            if (events.getEventId() == id)
                eventsTobeReturned = events;

            System.out.println("event start date:" + events.getStarDate());
            System.out.println("event id :" + events.getEventId());
            System.out.println("event who:" + events.getWho());
            System.out.println("event end date:" + events.getEndDate());
        }
        System.out.println("end of getEventId");
        // if (eventsTobeReturned==null)
        // System.out.println("get event id" +eventId " " "not found");

        return eventsTobeReturned;
    }

    public Events getByEventByWho(String who) {
        Events eventsTobeReturned = null;
        System.out.println(" getEventByWho");
        for (Events events1 : events) {
            //if (events1.getWho()==who)
            if (events1.getWho() == null)
                eventsTobeReturned = events1;
            System.out.println("event by id:" + events1.getEventId());
            System.out.println("event by start date :" + events1.getStarDate());
            System.out.println("event end date:" + events1.getEndDate());

        }
        System.out.println("end of getEventByWho");
        return eventsTobeReturned;
    }

    public String getWhoByStartDate(String startDate) {
        String who = null;
        for (Events events2 : events) {
            if (events2.getStarDate() == startDate)
                who = events2.getWho();
        }
        System.out.println("end of getwhobystartdate");
        return who;
    }

    public String getWhoByEndDate(String endDate) {
        String who = null;
        for (Events events3 : events) {
            if (events3.getEndDate() == endDate)
                who = events3.getWho();

        }
        System.out.println("end of getwhobyenddate");
        return who;
    }

    public Events getEventTypeByEventId(String eventId) {
        String eventType = null;
        for(Events events4 : events){
            if (events4.getEventType()==eventId)
                eventType=events4.getEventType();
        }
        System.out.println("end of getEventTypeById");
        return eventType;
    }
}

public boolean updateStartDateByWho(String who,String updateStartDate){
    boolean isStartDateUpdate=false;
    for (Events events:this.events){
       if (events.getWho()==who){
           events.setStarDate(updateStartDate);
           isStartDateUpdate=true;
       }
       if (isStartDateUpdate==false)
           System.out.println(who+"is not found");
       return isStartDateUpdate;
    }
}
    public boolean updateStartDateAndEndDateByWho(String who,String updateStartDate,String updateEndDate){
    boolean isStartDateAndEndDateUpdated= false;
    for (Events events:this.events){
        if (events.getWho()==who)
        {
            events.setStarDate(updateStartDate);
            events.setEndDate(updateEndDate);
            isStartDateAndEndDateUpdated=true;
        }
        if(isStartDateAndEndDateUpdated==false)
        System.out.println(who +"is not found");
        return isStartDateAndEndDateUpdated;
    }
    public boolean deleteEventById(int id){
            boolean isEventDelete = false;
            int i=0;
            for (int start=0;start<this.events.length;start++){
                //Events events=this.event[start];
                if (events[start].getEventId()!=id){
                    //this.event[i++]=this.event[start]
                    events[i++]=events[start];
                }
                else {
                    isEventDelete=true;
                }
            }

            int size=i;
            events= Array.copyOf(this.events,size);
            return isEventDelete;
        }



}







