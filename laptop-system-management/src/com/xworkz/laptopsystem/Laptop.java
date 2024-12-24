package com.xworkz.laptopsystem;

public class Laptop {


    public Laptop(){
        System.out.println("the cons is invoked");
    }
    private int id;
    private long price;

    public void id(){

    }
    public void price(){

    }

    public long getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        return "laptop-(laptopId ="+this.id+","+
                "price ="+this.price+")";
    }

}
