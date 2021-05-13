package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task6;

//Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
// с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле
// устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Main {
    public static void main(String[] args) {
       Time time = new Time();
       time.setTime();
       time.printTime();
       time.increaseSs(100000);
       time.printTime();
    }
}
