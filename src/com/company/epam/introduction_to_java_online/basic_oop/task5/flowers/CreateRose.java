package com.company.epam.introduction_to_java_online.basic_oop.task5.flowers;

import com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers.Flower;
import com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers.Rose;

public class CreateRose implements CreateFlower{
    @Override
    public Flower createFlower() {
        return new Rose();
    }
}
