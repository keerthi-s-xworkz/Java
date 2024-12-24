package com.xworkz.airtel.bill;

public class Bill {
    private String billNo;
    private double billAmt;

    public Bill(){

    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }
//    @Override
//    public String toString(){
//        return "bill=(billNo="+this.billNo+","+
//                "billAmt="+this.billAmt+")";
//    }

//    @Override
//    public int hashCode(){
//        return this.billAmt;
//    }


    @Override
    public  boolean equals (Object obj){
        Bill bill=(Bill) obj;     //explicit type casting
        //if(this.bookId==book.bookId && bookName ==book.bookName && author ==book.author && price==book.price)
        if (this.hashCode()==bill.hashCode())
            return true;

        return false;
    }
}


