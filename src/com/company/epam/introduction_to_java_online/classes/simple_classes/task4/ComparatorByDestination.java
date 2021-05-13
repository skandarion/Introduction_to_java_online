package com.company.epam.introduction_to_java_online.classes.simple_classes.task4;

import java.util.Comparator;

public class ComparatorByDestination implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        int result = o1.destination.compareTo(o2.destination);
        if(result == 0){
            result = o1.departureTime.compareTo(o2.departureTime);
        }
        return result;
    }
}

