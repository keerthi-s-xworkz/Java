package com.xworkz.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DoubleRunner {
    public static void main(String[] args) {
        List<Double> collection=new CopyOnWriteArrayList();
        collection.add(66.00);
        collection.add(56.09);
        collection.add(222.99);
        collection.add(999.99);
        collection.add(455.55);

        for (Object object:collection){
            Double value=(Double) object;
            collection.add(99.00);
            System.out.println(value);
        }

    }
}

