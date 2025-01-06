package com.xworkz.collections.comparator;

import com.xworkz.collections.Mobile;

import java.util.Comparator;

public class PriceComparator implements Comparator<Mobile> {
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
