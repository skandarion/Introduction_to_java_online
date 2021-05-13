package com.company.epam.introduction_to_java_online.basic_oop.task3;

public class Task3 {
    public static void main(String[] args) {
        Calendar c = new Calendar("calendar");
        c.addWeekend("24.04.2021");
        c.addHolyday("09.05.2021");

        c.showWeekends();
        c.showHolydays();
    }
}
