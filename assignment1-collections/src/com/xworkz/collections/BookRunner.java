package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookRunner {
    public static void main(String[] args) {

        List<Book> collection = new ArrayList<>();
        collection.add(new Book(1, "VIDYA", 45, 200));
        collection.add(new Book(2, "Gold", 55, 300));
        collection.add(new Book(3, "Classment", 65, 400));
        collection.add(new Book(4, "BaffnaGold", 20, 100));
        collection.add(new Book(5, "Classic", 38, 180));

        System.out.println(collection.
                stream().
                sorted(Comparator.comparing(Book::getName)).
                collect(Collectors.toList()));

//        Collection collection=new ArrayList();
//        collection.add(book);
//
//        System.out.println(book);
    }
}
