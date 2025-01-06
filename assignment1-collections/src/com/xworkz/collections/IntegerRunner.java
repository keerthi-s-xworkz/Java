package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IntegerRunner {
    public static void main(String[] args) {
        List <Integer>collection=new CopyOnWriteArrayList();
        collection.add(23);
        collection.add(76);
        collection.add(13);
        collection.add(98);
        collection.add(467);

        for (Object object:collection){
            Integer value=(Integer) object;
            collection.add(29);
            System.out.println(value);
        }

    }

}
