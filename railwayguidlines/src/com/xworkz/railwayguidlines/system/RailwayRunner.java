package com.xworkz.railwayguidlines.system;

public class RailwayRunner {

    public static void main(String[] args) {

        Railway railway=new Station();
        String station=railway.passengerName();
        System.out.println("the passenger name is :"+station);

        Railway railway1=new Station();
        int station1=railway1.age();
        System.out.println("the age of the passenger is :"+station1);

        Railway railway2=new Station();
        String station2=railway2.ticketNo();
        System.out.println("the passenger ticket number is :"+station2);

        Railway railway3=new Station();
        int station3=railway3.numberOfBlocks();
        System.out.println("the number of blocks in the train are:"+station3);

        Railway railway4=new Station();
        boolean station4=railway4.alarmChain();
        System.out.println("the passenger has pulled the alarm chain is :"+station4);

        Railway railway5=new Station();
        int station5=railway5.numberOfPassengers();
        System.out.println("the number of  passengers in the train are :"+station5);

        Railway railway6=new Station();
        String station6=railway.destation();
        System.out.println("the passenger destation is :"+station6);

        Railway railway7=new Station();
        String station7=railway7.annocement();
        System.out.println("the annocement in the train is :"+station7);

        Railway railway8=new Station();
        boolean station8=railway8.reservation();
        System.out.println("is the passenger is reserved :"+station8);

        Railway railway9=new Station();
        boolean station9=railway9.general();
        System.out.println("the passenger is in the general block  :"+station9);
    }
}
