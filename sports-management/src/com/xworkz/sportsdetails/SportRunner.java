package com.xworkz.sportsdetails;

import com.xworkz.sports.Cricket;

public class SportRunner {
    public static void main(String[] args) {
        Sport sport =new Cricket();
        sport.sportName();
        System.out.println("the  name is "+ sport.getSportName());
    }
}
