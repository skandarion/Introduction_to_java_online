package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task7;

public class Triangle {
    double x1,x2,y1,y2,z1,z2;

    public Triangle(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public Triangle() {
        this(0,0,0,0,0,0);
    }
    public double distance(double a1, double a2,double b1, double b2) {
        return Math.sqrt((b1 - a1)*(b1 - a1) + (b2 - a2)*(b2 - a2));
    }
    public double square(){
        double a = distance(x1, x2, y1,y2);
        double b = distance(y1, y2, z1,z2);
        double c = distance(z1, z2, x1,x2);
        double p = (a+b+c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double perimeter(){
        double a = distance(x1, x2, y1,y2);
        double b = distance(y1, y2, z1,z2);
        double c = distance(z1, z2, x1,x2);
        return  a+b+c;
    }
    public void medianaCross(){
        double a1 = (y1 + x1)/2;
        double a2 = (y2 + x2)/2;
        double res1 = (z1+a1*2)/3;
        double res2 = (z2+a2*2)/3;
        System.out.println("(" + res1 + ";" + res2 + ")");
    }
}
