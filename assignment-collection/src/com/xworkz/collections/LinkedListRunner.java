package com.xworkz.collections;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        Collection collection=new  LinkedList();
        collection.add(23);
        collection.add(13);
        collection.add(98);
        collection.add(467);
        collection.add(58);
        collection.add(868);
        collection.add(45);
        collection.add(23);
        collection.add(481);
        collection.add(64);
        collection.add(111);
        collection.add(98);
        System.out.println(collection);
    }
}
