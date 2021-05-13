package com.company.epam.introduction_to_java_online.basic_oop.task5.flowers;

import com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers.Begonia;
import com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers.Flower;

public class CreateBegonia implements CreateFlower{
    @Override
    public Flower createFlower() {
        return new Begonia();
    }
}
