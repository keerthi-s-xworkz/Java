package com.xworkz.theatre;

public class Theatre {

    public Theatre(){
        System.out.println("the cons is invoked");
    }

    private String name;

    public void name(String name){
        System.out.println("the theatre name is "+name);
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
