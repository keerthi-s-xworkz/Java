package com.xworkz.collections;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Hospital implements Comparable<Hospital>{

    private int id;
    private String patientName;
    private String address;
    private String cause;


    @Override
    public int compareTo(Hospital o) {
        return getCause().compareTo(getCause());
    }
}
