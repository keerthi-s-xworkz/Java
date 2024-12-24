package com.xworkz.temple.management;

public class Visiting implements TempleGuidlines {
     @Override
    public String templeName(){
        return("Ganesha,Shiva");
    }
    public String dressCode(){
        return ("Men-Shirt,Women-Kurthi");
    }
    public boolean bell(){
        return (true);
    }
    public String electronics(){
        return ("mobile");
    }
    public String templePlace(){
        return ("Basaveshwar nagar");
    }
    public int templeDistance(){
        return(45);
    }
    public  String direction(){
        return("stright to left");
    }
    public int timings(){
        return(9);
    }
}
