package com.xworkz.laptopsystem;

import com.xworkz.dell.Dell;
import com.xworkz.laptop.hp.HpLaptop;

public class LaptopRunner {

    public static void main(String[] args) {
        Laptop laptop=new HpLaptop();
        System.out.println(laptop);
        Laptop laptop1=new Dell();
        System.out.println(laptop);

//        laptop.id();
//        System.out.println("the laptop id is "+laptop.getId());
//
//        laptop1.price();
//        System.out.println("the laptop price is "+laptop1.getPrice());

    }
}
