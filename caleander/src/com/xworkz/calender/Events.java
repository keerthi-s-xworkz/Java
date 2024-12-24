package com.xworkz.calender;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    private int eventId;
    private String starDate;
    private String endDate;
    private String who;
    private String eventType;
    private boolean allDayEvent;


}
