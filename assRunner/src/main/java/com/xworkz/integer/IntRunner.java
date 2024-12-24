package com.xworkz.integer;

import java.util.ArrayList;
import java.util.Collection;

public class IntRunner {
    public static void main(String[] args) {

        Collection collection=new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);

        collection.remove(6);
        collection.add(8);
        collection.add(9);


          //collection.removeAll(collection);
       // collection.size();
        collection.containsAll(collection);
        System.out.println(collection);
    }
}
