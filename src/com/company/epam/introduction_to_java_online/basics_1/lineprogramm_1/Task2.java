package com.company.epam.introduction_to_java_online.basics_1.lineprogramm_1;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2

public class Task2 {
    public static void main(String[] args) {
        findResult(3,4,7);
    }

    public static void findResult(double a, double b, double c) {
        double result;
        if ((Math.pow(b, 2.0) + 4 * a * c) < 0) {
            System.out.println("error: negative number under root ");
        } else if (a == 0) {
            System.out.println("error: division by zero");
        } else {
            result = ((b + Math.sqrt((Math.pow(b, 2.0) + 4 * a * c))) /
                    (2 * a)) - (Math.pow(a, 3.0) * c) + Math.pow(b, -2.0);
            System.out.println("result is " + result);
        }
    }
}
