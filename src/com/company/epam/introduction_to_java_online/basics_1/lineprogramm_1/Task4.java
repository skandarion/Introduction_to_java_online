package com.company.epam.introduction_to_java_online.basics_1.lineprogramm_1;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static void main(String[] args) {
        findResult(123.456);
    }

    public static void findResult (double x){
        double y = ((x * 1000) % 1000) + (int) x / 1000.0;
        System.out.println(y);
    }
}
