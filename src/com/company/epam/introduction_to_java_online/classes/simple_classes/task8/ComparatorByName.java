package com.company.epam.introduction_to_java_online.classes.simple_classes.task8;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getSurname() != o2.getSurname()){
            return o1.getSurname().compareTo(o2.getSurname());
        }
        if(o1.getName() != o2.getName()){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getPatronymic().compareTo(o2.getPatronymic());
    }
}
