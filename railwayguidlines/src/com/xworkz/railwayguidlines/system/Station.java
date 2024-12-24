package com.xworkz.railwayguidlines.system;

public class Station implements Railway {
    @Override
    public String passengerName(){
        return ("keerthi");
    }
    public int age(){
        return (21);
    }
    public String ticketNo(){
        return ("423 4566777");
    }
    public int numberOfBlocks(){
        return (15);
    }
    public boolean alarmChain(){
        return (false);
    }
    public int numberOfPassengers(){
        return (80);
    }
    public String destation(){
        return ("Dharmasthala");
    }
    public String annocement(){
        return ("the train is in the flatform number 2");
    }
    public boolean reservation(){
        return (true);
    }
    public boolean general(){
        return (false);
    }
}
