package com.xworkz.collections;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Clothes implements Comparable<Clothes> {
    private int id;
    private String name;
    private int price;
    private String colour;

    @Override
    public int compareTo(Clothes o) {
//        return this .getName().compareTo(getName());
        return this.getId()-o.getId();
    }
}
