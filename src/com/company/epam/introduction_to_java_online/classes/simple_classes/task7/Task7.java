package com.company.epam.introduction_to_java_online.classes.simple_classes.task7;

public class Task7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,4,3,7,8,3);
        System.out.println(triangle.distance(triangle.x1, triangle.x2, triangle.y1, triangle.y2));
        System.out.println(triangle.square());
        triangle.medianaCross();
    }
}
