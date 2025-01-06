package com.xworkz.collections;

import com.xworkz.collections.comparator.IdComparator;
import com.xworkz.collections.comparator.NameComparator;
import com.xworkz.collections.comparator.PriceComparator;

import java.util.*;
import java.util.stream.Collectors;

public class MobileRunner {
    public static void main(String[] args) {

//        Mobile mobile=new Mobile();
//        mobile.setId(1);
//        mobile.setName("RealMe Narzo");
//        mobile.setPrice(25000);
//
//
//        Collection collection=new ArrayList();
//        collection.add(mobile);
//
//        System.out.println(mobile);

        List<Mobile> collection=new ArrayList<>();
        collection.add(new Mobile(1,"RealMe",45000) );
        collection.add(new Mobile(2,"Samsung",23000) );
        collection.add(new Mobile(3,"Mi",12000) );
        collection.add(new Mobile(4,"Vivo",50000) );

//        for (Object ob:collection)
//            System.out.println(ob);
//        System.out.println("---------------");

//        //utility class

//        Collections.sort(collection,new NameComparator());
//        Collections.sort(collection,new PriceComparator());
//        Collections.sort(collection,new IdComparator());
//
//        for (Object o:collection)
//            System.out.println(o);

        System.out.println(collection.
                stream().
                sorted(Comparator.comparing(Mobile::getName)).
                collect(Collectors.toList()));
    }
}
