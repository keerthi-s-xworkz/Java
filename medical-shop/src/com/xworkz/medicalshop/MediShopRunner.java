package com.xworkz.medicalshop;

import com.xworkz.medical.Medi;

public class MediShopRunner {
    public static void main(String[] args) {
        MedicalShop medicalShop = new MedicalShop();
        Medi medi = new medi();
        Medi.setshopId(7);
        Medi.setshopName("adhiti");
        Medi.setPrice(99.99);

        medicalShop.addShop(medi);
        System.out.println("medical shop id is "+);
    }
}
