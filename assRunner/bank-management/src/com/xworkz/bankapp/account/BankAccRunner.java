package com.xworkz.bankapp.account;

import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccRunner {

    public static void main(String[] args) {
        //polymorphism/casting

//        SavingsAccount bankAccount=new SavingsAccount();
//        bankAccount.intrest=2.70;
//        bankAccount.credit(687);
//        bankAccount.credit(309);
//        System.out.println("the bank balance is"+bankAccount.getBalance());
//        bankAccount.calculateRateOfIntrest();
//        System.out.println("the bank balance is "+bankAccount.getBalance());
//
//        SavingsAccount myAccount=new SavingsAccount();
//        myAccount.intrest=2.80;
//        myAccount.credit(6787);
//        myAccount.debit(4000);
//        System.out.println("my account balance is "+myAccount.getBalance());
//        myAccount.calculateRateOfIntrest();
//        System.out.println("my account balance is "+myAccount.getBalance());
//
//        SavingsAccount frndAccount=new SavingsAccount();
//        frndAccount.intrest=3.20;
//        frndAccount.credit(788);
//        frndAccount.debit(500);
//        System.out.println("the frnd balance is "+frndAccount.getBalance());
//        frndAccount.calculateRateOfIntrest();
//        System.out.println("the frnd balance is "+frndAccount.getBalance());
//        frndAccount.transfer(bankAccount ,678);
//        System.out.println("frnd account balance is "+frndAccount.getBalance());
//        System.out.println("the bank account balance is "+bankAccount.getBalance());
//
//        myAccount.transfer(frndAccount ,200);
//        System.out.println("my account balance is"+myAccount.getBalance());
//        System.out.println("frnd account is"+frndAccount.getBalance());
//
//        SavingsAccount fatherAccount=new SavingsAccount();
//        fatherAccount.intrest=3.90;
//        fatherAccount.credit(700);
//        fatherAccount.debit(255);
//        System.out.println("father account balance is"+fatherAccount.getBalance());
//        fatherAccount.calculateRateOfIntrest();
//        System.out.println("father account balance is"+fatherAccount.getBalance());
//        fatherAccount.transfer(myAccount,150);
//        System.out.println("father account balance is "+fatherAccount.getBalance());
//        System.out.println("my account is "+myAccount.getBalance());
//
//
//
//        SavingsAccount motherAccount=new SavingsAccount();
//        motherAccount.intrest=2.80;
//        motherAccount.credit(200);
//        motherAccount.debit(222);
//        System.out.println("mother account balance is "+motherAccount.getBalance());
//        motherAccount.calculateRateOfIntrest();
//        System.out.println("mother account balance is"+motherAccount.getBalance());
//
//        motherAccount.transfer(fatherAccount,300);
//        System.out.println("mother account balance is"+motherAccount.getBalance());
//        System.out.println("father account balnace is"+fatherAccount.getBalance());
//    }
        CurrentAccount currentAccount = new CurrentAccount();
        System.out.println(currentAccount.toString());//explicit calling of toString
        System.out.println(currentAccount);//implicit calling of toString
        System.out.println(currentAccount.getClass());
    }
}
//string representation of an object
