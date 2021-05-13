package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task3 {
    public double rightTriangleArea (double a){
        return a*a*Math.sqrt(3)/4;
    }
    public double rightHexagonArea (double b){
        return rightTriangleArea(b)*6;
    }
}
