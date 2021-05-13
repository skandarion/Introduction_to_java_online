package com.company.epam.introduction_to_java_online.basic_oop_5.task3;

//Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {
    public static void main(String[] args) {
        Calendar c = new Calendar("calendar");
        c.addWeekend("24.04.2021");
        c.addHolyday("09.05.2021");

        c.showWeekends();
        c.showHolydays();
    }
}
