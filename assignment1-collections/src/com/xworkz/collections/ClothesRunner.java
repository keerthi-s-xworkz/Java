package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClothesRunner {
    public static void main(String[] args) {

//        Clothes clothes=new Clothes();
//        clothes.setId(1);
//        clothes.setName("FROCK");
//        clothes.setPrice(2500);
//        clothes.setColour("BLUE");

        List<Clothes> collection=new ArrayList<>();
        collection.add(new Clothes(1,"FROCK",35000,"BLACK"));
        collection.add(new Clothes(9,"ANARKALI",1500,"WHITE"));
        collection.add(new Clothes(3,"HALF-SAREE",2500,"LIGHT-BLUE"));
        collection.add(new Clothes(0,"CHUDIDHAR",1000,"PINK"));

//        Collection collection=new ArrayList();
//        collection.add(clothes);
//
//        System.out.println(clothes);

        System.out.println(collection.
                stream().
                sorted(Comparator.comparing(Clothes::getId)).
                collect(Collectors.toList()));
    }
}
