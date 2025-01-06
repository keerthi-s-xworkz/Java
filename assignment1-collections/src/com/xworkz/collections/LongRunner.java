package com.xworkz.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LongRunner {
    public static void main(String[] args) {
        List<Long> collection=new CopyOnWriteArrayList();
        collection.add(8753945835L);
        collection.add(52309489012L);
        collection.add(763534994320L);
        collection.add(42631933746L);
        collection.add(4632492381L);

        for (Object object:collection){
            Long value=(Long) object;
            collection.add(5783465365L);
            System.out.println(value);
        }


    }
}

