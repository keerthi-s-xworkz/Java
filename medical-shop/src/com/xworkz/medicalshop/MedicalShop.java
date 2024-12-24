package com.xworkz.medicalshop;

import com.xworkz.medical.Medi;

public class MedicalShop {
        Medi medi;

        public boolean addShop(Medi medi) {
            boolean isAdded = false;
            if (medi != null) {
                if (Medi.getshopId() > 0 && Medi.getshopName() != null) {
                    this.medi = medi;
                    isAdded = true;
                }
            }
            return isAdded;
        }

    }


