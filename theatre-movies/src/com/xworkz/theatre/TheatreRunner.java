package com.xworkz.theatre;

import com.xworkz.theatre.movies.PvrTheatre;

public class TheatreRunner {

    public static void main(String[] args) {
        Theatre theatre=new Theatre();


        theatre.name("X-workz");
        System.out.println("the theatre name is "+theatre.getName());
        PvrTheatre pvrTheatre=new PvrTheatre();
    }

}
