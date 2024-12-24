package com.xworkz.snacks;

public class Type {
    Snacks snacks[]=new Snacks[1];
    int index;

    public boolean addSnacks(Snacks snacks) {
        if (index < this.snacks.length) {
            if (snacks.getId() > 0 && snacks.getName() != null && snacks.getBrand() != null) {
                this.snacks[index++] = snacks;
                System.out.println("snacks are added successfully");
                return true;
            } else {
                System.out.println("invalid snacks details");
                return false;
            }
        } else {
            System.out.println("array index out of boundary: snacks array is full");
            return false;
        }
    }
    public void getDetails(){
        System.out.println("snacks details");
        for (Snacks ref:snacks){
            if (ref !=null){
                System.out.println("snacks id :"+ref.getId());
                System.out.println("snacks name:"+ref.getName());
                System.out.println("snacks brand:"+ref.getBrand());
                System.out.println("snacks price:"+ref.getPrice());
            }else{
                System.out.println("no availability");
            }
        }
    }
    public Snacks getById(int id) {
        System.out.println("getId method started");
        Snacks isIdFound = null;
        for (Snacks ref : snacks) {
            if (ref != null && ref.getId() == id) {
                isIdFound = ref;
                System.out.println("snacks id :" + ref.getId());
                System.out.println("snacks name:" + ref.getName());
                System.out.println("snacks  brand:" + ref.getBrand());
                System.out.println("snacks price :" + ref.getPrice());
            }
        }
        if (isIdFound == null) {
            System.out.println("not found");
        }
        System.out.println("get id method ended");
        return isIdFound;
    }
    public Snacks getByName(String name) {
        System.out.println("getName method started");
        Snacks isNameFound = null;
        for (Snacks ref : snacks) {
            if (ref != null && ref.getName() == name) {
                isNameFound = ref;
                System.out.println("snacks id :" + ref.getId());
                System.out.println("snacks name:" + ref.getName());
                System.out.println("snacks  brand:" + ref.getBrand());
                System.out.println("snacks price :" + ref.getPrice());
            }
        }
        if (isNameFound == null) {
            System.out.println("not found");
        }
        System.out.println("get name method ended");
        return isNameFound;
    }

}
