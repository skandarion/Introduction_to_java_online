package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task1;

public class Word {
    private String value;

    public Word(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public void print(){
        System.out.print(value + " ");
    }
}
