package com.company.epam.introduction_to_java_online.basic_oop.task5;

// для создания объектов цветов и упаковки использовал паттерн factory.

public class Task5 {
    public static void main(String[] args) {
        FlowerComposition flowerComposition = new FlowerComposition("firstComposition");
        flowerComposition.addFlowerToComposition("rose");
        flowerComposition.addFlowerToComposition("smth");
        flowerComposition.addFlowerToComposition("begonia");
        flowerComposition.addFlowerToComposition("tulip");
        flowerComposition.addPackagingToComposition("film");
        flowerComposition.addPackagingToComposition("organza");
        System.out.println(flowerComposition.toString());

    }
}
