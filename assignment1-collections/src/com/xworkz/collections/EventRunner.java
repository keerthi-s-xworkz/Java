package com.xworkz.collections;

import java.util.*;
import java.util.stream.Collectors;

public class EventRunner {

    public static void main(String[] args) {

//        Event event=new Event();
//        event.setId(1);
//        event.setName("Akhila");
//        event.setDate("15/1/2025");
//        event.setDescription("trip");
//
//        Collection collection=new ArrayList();
//        collection.add(event);
//
//        System.out.println(event);

        List<Event> collection=new ArrayList<>();
        collection.add(new Event(1,"BHARATH","10/1/25","NATIVE"));
        collection.add(new Event(2,"DARSHAN","9/1/25","BIRTHDAY"));
        collection.add(new Event(3,"VARUN","8/1/25","TRIP"));
        collection.add(new Event(4,"SACHIN","24/3/25","EXAM"));
        collection.add(new Event(5,"NAGARAJ","15/1/25","TRAVILING"));
        collection.add(new Event(6,"RAJESH","11/1/25","PARTY"));
        collection.add(new Event(7,"SAIVIRAT","20/1/25","LEAVE"));

        System.out.println(collection.
                stream().
                sorted(Comparator.comparing(Event::getDescription)).
                collect(Collectors.toList()));
    }
}
