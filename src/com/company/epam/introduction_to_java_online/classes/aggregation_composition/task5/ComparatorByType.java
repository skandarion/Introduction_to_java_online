package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task5;

import java.util.Comparator;

public class ComparatorByType implements Comparator<Tour> {
    @Override
    public int compare(Tour o1, Tour o2) {
        return o1.getTourType().compareTo(o2.getTourType());
    }
}
