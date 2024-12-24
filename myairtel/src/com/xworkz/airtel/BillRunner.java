package com.xworkz.airtel;

import com.xworkz.airtel.bill.Bill;

public class BillRunner {
    public static void main (String args[]){
        Bill bill = new Bill();
        System.out.println(bill);
        bill.setBillNo("87598");

        //System.out.println("the bill no is "+bill.getBillNo());
        Bill bill2 = new Bill();
        //System.out.println(bill);
        bill.setBillAmt(789.22);
        System.out.println("the bill amt is "+bill.toString());


        boolean same=bill2.equals(bill);
        System.out.println(same);

        System.out.println(bill.hashCode());
        System.out.println(bill.hashCode());
    }
}
