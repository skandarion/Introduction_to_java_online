package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task7;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,4,3,7,8,3);
        System.out.println(triangle.distance(triangle.x1, triangle.x2, triangle.y1, triangle.y2));
        System.out.println(triangle.square());
        triangle.medianaCross();
    }
}
