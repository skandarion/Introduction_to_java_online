package com.company.epam.introduction_to_java_online.basic_oop.task3;

import java.util.GregorianCalendar;
import java.util.HashSet;

public class Calendar {
    private String calendarName;
    HashSet<Day> weekends;
    HashSet<Day> holydays;

    public Calendar(String calendarName) {
        this.calendarName = calendarName;
        weekends = new HashSet<Day>();
        holydays = new HashSet<Day>();
    }

    public void addWeekend (String date){
        Day d = new Day(date);
        d.description = "weekend";
        weekends.add(d);
    }
    public void addHolyday (String date){
        Day d = new Day(date);
        d.description = "holyday";
        weekends.add(d);
    }
    public void showWeekends(){
        weekends.forEach(System.out::println);
    }
    public void showHolydays(){
        holydays.forEach(System.out::println);
    }

    public class Day{
        public String description;
        private String date;

        public Day(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "description='" + description + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }
}
