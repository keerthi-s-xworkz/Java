package com.xworkz.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CharacterRunner {
    public static void main(String[] args) {
        List<Character> collection=new CopyOnWriteArrayList();
        collection.add('k');
        collection.add('e');
        collection.add('e');
        collection.add('r');
        collection.add('t');
        collection.add('h');
        collection.add('i');

        for (Object object:collection){
            Character value=(Character) object;
            collection.add('S');
            System.out.println(value);
        }

    }
    }

