package com.xworkz.temple.management;

public class TempleRunner {
    public static void main(String[] args) {

        TempleGuidlines templeGuidlines=new Visiting();
        String visiting=templeGuidlines.templeName();
        System.out.println("the temple name is:"+visiting);

        TempleGuidlines templeGuidlines1=new Visiting();
        String visiting1=templeGuidlines.dressCode();
        System.out.println("the temple dressCode is:"+visiting1);

        TempleGuidlines templeGuidlines2=new Visiting();
        boolean visiting2=templeGuidlines.bell();
        System.out.println("in the temple bell is ringed are not:"+visiting2);

        TempleGuidlines templeGuidlines3=new Visiting();
        String visiting3=templeGuidlines.electronics();
        System.out.println("the temple electronics are not allowed is:"+visiting3);

        TempleGuidlines templeGuidlines4=new Visiting();
        String visiting4=templeGuidlines.templePlace();
        System.out.println("the temple place is located near:"+visiting4);

        TempleGuidlines templeGuidlines5=new Visiting();
        int visiting5=templeGuidlines.templeDistance();
        System.out.println("the temple distance  is:"+visiting5);

        TempleGuidlines templeGuidlines6=new Visiting();
        String visiting6=templeGuidlines.direction();
        System.out.println("the direction of the temple is:"+visiting6);

        TempleGuidlines templeGuidlines7=new Visiting();
        int visiting7=templeGuidlines.timings();
        System.out.println("the temple timimgs are is:"+visiting7);

    }
}
