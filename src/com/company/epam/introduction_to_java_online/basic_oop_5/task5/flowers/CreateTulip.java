package com.company.epam.introduction_to_java_online.basic_oop_5.task5.flowers;

import com.company.epam.introduction_to_java_online.basic_oop_5.task5.flowers.flowers.Flower;
import com.company.epam.introduction_to_java_online.basic_oop_5.task5.flowers.flowers.Tulip;

public class CreateTulip implements CreateFlower{
    @Override
    public Flower createFlower() {
        return new Tulip();
    }
}
