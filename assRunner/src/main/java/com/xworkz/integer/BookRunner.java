package com.xworkz.integer;

import java.util.ArrayList;
import java.util.Collection;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        book.setBookId(1);
        book.setName("golden days");
        book.setPrize(99.00);
        Collection collection=new ArrayList();
        collection.add(book);
        System.out.println(collection);

        book.setBookId(2);
        book.setName("good times");
        book.setPrize(100.99);
        Collection collection1=new ArrayList();
        collection1.add(book);
        System.out.println(collection1);

        book.setBookId(3);
        book.setName("Harry Potter");
        book.setPrize(150.58);
        Collection collection2=new ArrayList();
        collection2.add(book);
        System.out.println(collection2);

        book.setBookId(4);
        book.setName("Macbeth");
        book.setPrize(50.89);
        Collection collection3=new ArrayList();
        collection3.add(book);
        System.out.println(collection3);
    }
}
