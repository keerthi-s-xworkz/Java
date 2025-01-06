package com.xworkz.collections;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book implements Comparable<Book> {

    private int id;
    private String name;
    private int price;
    private int noOfPages;

    @Override
    public  int compareTo(Book e){
        return this.getId()-e.getId();
    }
}
