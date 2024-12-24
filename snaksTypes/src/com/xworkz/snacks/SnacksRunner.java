package com.xworkz.snacks;

public class SnacksRunner {
    public static void main(String[] args) {
        Snacks snacks = new Snacks();
        snacks.setId(1);
        System.out.println(snacks);
        snacks.setName("potato lays");
        snacks.setBrand("Haldirams");
        snacks.setPrice(25);
        //System.out.println(snacks);


        Snacks snacks1 = new Snacks();
        snacks.setId(1);
        System.out.println(snacks);
        snacks.setName("potato lays");
        snacks.setBrand("Haldirams");
        snacks.setPrice(25);
       // System.out.println(snacks);

//        Type type=new Type();
//        type.addSnacks(snacks);
//        //type.getDetails();
//        type.getById(1);
//       // System.out.println(snacks);
//        type.getByName("potato lays");
//        System.out.println(snacks);

        boolean same=snacks1.equals(snacks);
        System.out.println(same);

        System.out.println(snacks1.hashCode());
        System.out.println(snacks.hashCode());

    }
}