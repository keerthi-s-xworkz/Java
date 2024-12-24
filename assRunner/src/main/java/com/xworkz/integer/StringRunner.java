package com.xworkz.integer;

import java.util.ArrayList;
import java.util.Collection;

public class StringRunner {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("PAVI");
        collection.add("MANASA");
        collection.add("KEERTHI");
        collection.add("NAGS");
        collection.add("RAJII");
        collection.add("SAIVIRAT");
        collection.add("SOUMYA");
        collection.add("AKHILA");

        collection.remove("AKHILA");
        collection.remove("KEERTHI");
        collection.add("BHARATH");
        collection.add("DARSHAN");

        //collection.removeAll(collection);
        //collection.size();
        collection.containsAll(collection);
        System.out.println(collection);
    }
}
