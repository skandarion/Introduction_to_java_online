package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task3 {
    public static void main(String[] args) {
        double d = rightHexagonArea(3);
        System.out.println(d);
    }

    public static double rightTriangleArea (double a){
        return a*a*Math.sqrt(3)/4;
    }
    public static double rightHexagonArea (double b){
        return rightTriangleArea(b)*6;
    }
}
