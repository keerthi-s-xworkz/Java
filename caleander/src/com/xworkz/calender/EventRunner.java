package com.xworkz.calender;

public class EventRunner {

    public static void main(String[] args) {
        //Events c1 =new Events();
        //c1.setEventId(34);
        //System.out.println("event id is "+c1.getEventId());

        //Events c2=new Events();
        //c2.setStarDate("13/06/2002");
        //System.out.println("start date is "+c2.getStarDate());

        //Events c3=new Events();
        //c3.setEndDate("15/07/1999");
        //System.out.println("end date is "+c3.getEndDate());


        Events events=new Events();
        events.setEventId(28);
       // events.setEventType(EventsType.Birthdays);
        events.setAllDayEvent(true);
        events.setWho("keerthi s");
        events.setStarDate("19/9/1899");
        events.setEndDate("23/6/1967");


        Events events1=new Events();
        events1.setEventId(2);
        events1.setAllDayEvent(true);
        events1.setWho("akhiiii");
        events1.setStarDate("13/06/2002");
        events1.setEndDate("26/02/2002");

        Events events2=new Events();
        events2.setEventId(3);
        events2.setAllDayEvent(true);
        events2.setWho("heena");
        events2.setStarDate("15/07/2002");
        events2.setEndDate("6/02/2636");

        Events events3=new Events();
        events3.setEventId(6);
        events3.setAllDayEvent(true);
        events3.setWho("pavi");
        events3.setStarDate("25/07/2984");
        events3.setEndDate("9/02/1783");

        Events events4=new Events();
        events4.setEventId(7);
        events4.setAllDayEvent(true);
        events4.setWho("manasa");
        events4.setStarDate("9/6/2009");
        events4.setEndDate("22/11/1986");

        Events events5=new Events();
        events5.setEventId(6);
        events5.setAllDayEvent(true);
        events5.setWho("hamsa");
        events5.setStarDate("3/7/1999");
        events5.setEndDate("6/02/1768");

        Events events6=new Events();
        events6.setEventId(9);
        events6.setAllDayEvent(true);
        events6.setWho("manju");
        events6.setStarDate("22/07/2002");
        events6.setEndDate("12/4/1947");

        Events events7=new Events();
        events7.setEventId(2);
        events7.setAllDayEvent(true);
        events7.setWho("gourii");
        events7.setStarDate("22/9/1546");
        events7.setEndDate("4/7/1879");

        Events events8=new Events();
        events8.setEventId(8);
        events8.setAllDayEvent(true);
        events8.setWho("paru");
        events8.setStarDate("4/10/2000");
        events8.setEndDate("15/5/2001");

        Events events9=new Events();
        events9.setEventId(9);
        events9.setAllDayEvent(true);
        events9.setWho("nags");
        events9.setStarDate("15/07/2002");
        events9.setEndDate("20/7/1999");

        Calender calender=new Calender();
        calender.addEvents(events);
        calender.addEvents(events1);
        calender.addEvents(events2);
        calender.addEvents(events3);
        calender.addEvents(events4);
        calender.addEvents(events5);
        calender.addEvents(events6);
        calender.addEvents(events7);
        calender.addEvents(events8);
        calender.addEvents(events9);

        calender.getAllEvents();
        calender.getbyeventid(28);
        calender.getByEventByWho("akhii");



//        Calender calender1=new Calender();
//        calender1.addEvents(events1);
//
//        Calender calender2=new Calender();
//        calender2.addEvents(events2);
//
//        Calender calender3=new Calender();
//        calender3.addEvents(events3);
//
//        Calender calender4=new Calender();
//        calender4.addEvents(events4);
//
//        Calender calender5=new Calender();
//        calender5.addEvents(events5);
//
//        Calender calender6=new Calender();
//        calender6.addEvents(events6);
//
//        Calender calender7=new Calender();
//        calender7.addEvents(events7);
//
//        Calender calender8=new Calender();
//        calender8.addEvents(events8);
//
//        Calender calender9=new Calender();
//        calender9.addEvents(events9);


//        System.out.println("event id is = "+events.getEventId());
//        System.out.println("all the  events days  are = "+events.isAllDayEvent());
//        System.out.println("event name of the custom is = "+events.getWho());
//        System.out.println("event start date is = "+events.getStarDate());
//        System.out.println("event end date is = "+events.getEndDate());
//
//
//        System.out.println("event id is = "+events1.getEventId());
//        System.out.println("all the events days are = "+events1.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events1.getWho());
//        System.out.println("event start date is = "+events1.getStarDate());
//        System.out.println("events end date is = "+events1.getEndDate());
//
//        System.out.println("event id is = "+events2.getEventId());
//        System.out.println("all the events days are = "+events2.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events2.getWho());
//        System.out.println("event start date is = "+events2.getStarDate());
//        System.out.println("events end date is = "+events2.getEndDate());
//
//        System.out.println("event id is = "+events3.getEventId());
//        System.out.println("all the events days are = "+events3.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events3.getWho());
//        System.out.println("event start date is = "+events3.getStarDate());
//        System.out.println("events end date is = "+events3.getEndDate());
//
//        System.out.println("event id is = "+events4.getEventId());
//        System.out.println("all the events days are = "+events4.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events4.getWho());
//        System.out.println("event start date is = "+events4.getStarDate());
//        System.out.println("events end date is = "+events4.getEndDate());
//
//        System.out.println("event id is = "+events5.getEventId());
//        System.out.println("all the events days are = "+events5.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events5.getWho());
//        System.out.println("event start date is = "+events5.getStarDate());
//        System.out.println("events end date is = "+events5.getEndDate());
//
//        System.out.println("event id is = "+events6.getEventId());
//        System.out.println("all the events days are = "+events6.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events6.getWho());
//        System.out.println("event start date is = "+events6.getStarDate());
//        System.out.println("events end date is = "+events6.getEndDate());
//
//        System.out.println("event id is = "+events7.getEventId());
//        System.out.println("all the events days are = "+events7.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events7.getWho());
//        System.out.println("event start date is = "+events7.getStarDate());
//        System.out.println("events end date is = "+events7.getEndDate());
//
//        System.out.println("event id is = "+events8.getEventId());
//        System.out.println("all the events days are = "+events8.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events8.getWho());
//        System.out.println("event start date is = "+events8.getStarDate());
//        System.out.println("events end date is = "+events8.getEndDate());
//
//        //System.out.println("event id is = "+events9.getEventId());
//        System.out.println("all the events days are = "+events9.isAllDayEvent());
//        System.out.println("event name of the customer is = "+events9.getWho());
//        System.out.println("event start date is = "+events9.getStarDate());
//        System.out.println("events end date is = "+events9.getEndDate());
//

    }
}

