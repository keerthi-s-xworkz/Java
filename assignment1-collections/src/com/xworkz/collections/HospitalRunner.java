package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalRunner {
    public static void main(String[] args) {

//        Hospital hospital=new Hospital();
//        hospital.setId(1);
//        hospital.setPatientName("Keerthi");
//        hospital.setAddress("9/12/2024");
//        hospital.setCause("feaver");
//
//        Collection collection=new ArrayList();
//        collection.add(hospital);
//
//        System.out.println(hospital);

        List<Hospital> collection=new ArrayList<>();
        collection.add(new Hospital(1,"keerthi","BasaveshwarNagar","cough"));
        collection.add(new Hospital(2,"Akhii","Neheru Colony","Cold"));
        collection.add(new Hospital(3,"pavi","Mg Road","legPain"));
        collection.add(new Hospital(4,"paru","Gandhi Nagar","Fever"));
        collection.add(new Hospital(5,"hamsa","Parvati Nagar","HeadAche"));
        collection.add(new Hospital(6,"usha","11/1/25","High Fever"));


        System.out.println(collection.
                stream().
                sorted(Comparator.comparing(Hospital::getCause)).
                collect(Collectors.toList()));
    }
}
