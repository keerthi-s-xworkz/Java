package com.xworkz.trafficsystem;

public interface Traffic {
    int speed();
    String direction();
    boolean lights();
    boolean signals();
    String colours();
    int noOfVehicleInTheTraffic();
    String nameOfTwoWeller();
    String nameOfFourWeller();
    int speedLimit();
    boolean license();

}
