package com.company.epam.introduction_to_java_online.basics.lineprogramm;

public class Task3 {
    public void findResult (double x, double y){
        if (x < 0 || x > 360 || y < 0 || y > 360){
            System.out.println("error: недопустимое значение x или y");
        }
        else if (((Math.cos(Math.toRadians(x))) - Math.sin(Math.toRadians(y))) == 0){
            System.out.println("error: division by zero");
        }
        else {
            double result = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))) * Math.tan(Math.toRadians(x*y));
            System.out.println(result);
        }
    }
}
