package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.account.BankAccount;

public class SavingsAccount extends  BankAccount {
    public double intrest;

    public SavingsAccount(){
        super();//super statement//super chaining
        System.out.println("saving account cons is invoked");
    }
//    public SavingsAccount(double minBalance){
//        super.setBalance(minBalance);
//        System.out.println("the saving account cons invoked");
//    }
//    public SavingsAccount(double intrest,double minBalance){
//        super.setBalance(minBalance);
//        this.intrest=intrest;
//        System.out.println("the saving account of intrest cons invoked");
//    }
//    public void calculateRateOfIntrest(){
//        double calculateIntrest=(super.getBalance()*intrest/100);
//        super.credit(calculateIntrest);
//    }
//


}
