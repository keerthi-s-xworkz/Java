package com.xworkz.collections;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor@NoArgsConstructor
public class Event implements  Comparable<Event>{

    private int id;
    private String name;
    private String date;
    private String description;

    @Override
    public int compareTo(Event o) {
        return  getDescription().compareTo(getDescription());

    }
}
