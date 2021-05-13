package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9 {
    public static void main(String[] args) {
        double d = getResult();
        System.out.println(d);
    }

    public static double getResult(){
        return areaWithRightAngle(3,4,10,7);
    }

    public static double areaWithRightAngle (double x,double y, double z, double t){
        double area1, area2;
        double a = Math.sqrt(x*x + y*y);
        area1 = x*y/2;
        double p = (z+t+a)/2;
        area2 = Math.sqrt(p*(p-a)*(p-z)*(p-t));
        return area1+area2;
    }
}
