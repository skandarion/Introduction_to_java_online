package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task5;

import java.util.Comparator;

public class ComparatorByTransport implements Comparator<Tour> {
    @Override
        public int compare(Tour o1, Tour o2) {
            return o1.getTypeOfTransport().compareTo(o2.getTypeOfTransport());
    }
}
