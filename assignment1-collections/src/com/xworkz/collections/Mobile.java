package com.xworkz.collections;

import lombok.*;

import java.util.Comparator;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Mobile implements Comparable<Mobile>{        //if we give only comparable with out using<event> then we should do casting
    private int id;
    private String name;
    private int price;

   // @Override
//    public int compareTo(Event o) {
//        return this.getId()-o.getId();
//       // return this.getName().compareTo(o-getName());
//    }
    @Override
    public  int compareTo(Mobile e){
//        return this .getName().compareTo(getName());
        return this.getId()-e.getId();
    }

}
