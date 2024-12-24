package com.xworkz.trafficsystem;

public class TrafficRunner {
    public static void main(String[] args) {

        Traffic traffic=new Signals();
        int signals=traffic.speedLimit();
        System.out.println("the traffic speed limit is:"+signals);

        Traffic traffic1=new Signals();
        String signals1=traffic1.direction();
        System.out.println("the direction of the signal areL"+signals1);

        Traffic traffic2=new Signals();
        boolean signals2=traffic2.lights();
        System.out.println("the traffic signal light is on or not:"+signals2);

        Traffic traffic3=new Signals();
        boolean signals3=traffic3.signals();
        System.out.println("the traffic signals signals are:"+signals3);

        Traffic traffic4=new Signals();
        String signals4=traffic4.colours();
        System.out.println("the traffic signal colour is:"+signals4);

        Traffic traffic5=new Signals();
        int signals5=traffic5.noOfVehicleInTheTraffic();
        System.out.println("the traffic signal has the more than one vehicle:"+signals5);

        Traffic traffic6=new Signals();
        String signals6=traffic6.nameOfTwoWeller();
        System.out.println("the two weller are:"+signals6);

        Traffic traffic7=new Signals();
        String signals7=traffic7.nameOfFourWeller();
        System.out.println("the traffic signal has two weller bikes:"+ signals7);

        Traffic traffic8=new Signals();
        int signals8=traffic8.speedLimit();
        System.out.println("the traffic signal has speed limit of:"+signals8);

        Traffic traffic9=new Signals();
        boolean signals9=traffic9.license();
        System.out.println("the user as license are not ;"+signals9);

    }
}
