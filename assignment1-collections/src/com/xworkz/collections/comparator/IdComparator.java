package com.xworkz.collections.comparator;

import com.xworkz.collections.Mobile;

import java.util.Comparator;

public class IdComparator implements Comparator<Mobile> {
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getId()-o2.getId();
    }
}
