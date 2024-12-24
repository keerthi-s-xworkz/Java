package com.xworkz.trafficsystem;

public class Signals implements Traffic {
    @Override
    public int speed(){
        return(85);
    }
    public String direction(){
        return("left");
    }
    public boolean lights(){
        return(true);
    }
    public  boolean signals(){
        return(false);
    }
    public String colours(){
        return("green");
    }
    public int noOfVehicleInTheTraffic(){
        return(25);
    }
    public String  nameOfTwoWeller(){
        return("Honda");
    }
    public String nameOfFourWeller(){
        return("Mercedes");
    }
    public int speedLimit(){
        return(45);
    }
    public boolean license(){
        return(true);
    }
}
