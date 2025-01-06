package com.xworkz.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringRunner {
    public static void main(String[] args) {
        List<String> collection=new CopyOnWriteArrayList();
        collection.add("keerthi");
        collection.add("Akhila");
        collection.add("Pavi");
        collection.add("Manasa");
        collection.add("kavya");

        for (Object object:collection){
            String value=(String) object;
            collection.add("MANJULA");
            System.out.println(value);
        }

    }

}
