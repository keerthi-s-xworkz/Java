package com.xworkz.snacks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snacks {
    private int id;
    private String name;
    private String brand;
    private int price;

//    @Override
//    public String toString(){
//        return "snacks-(snacksId ="+this.id+","+
//                "snacksName="+this.name+","+
//                "brand ="+this.brand+","+
//                "price ="+this.price+")";
//    }
    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public  boolean equals (Object obj){
        Snacks snacks=(Snacks) obj;
        if (this.hashCode()==snacks.hashCode())
            return true;

        return false;
    }

}
