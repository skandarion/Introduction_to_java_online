package com.company.epam.introduction_to_java_online.basic_oop_5.task1;

public class TextFile extends File {

    private String value;

    public TextFile(String fileName) {
        super(fileName);
    }

    public TextFile() {

    }

    public void create(){
        TextFile t = new TextFile();
    }
    public void printValue(){
        System.out.println(value);
    }
    public void addToValue(String addition){
        value.concat(addition);
    }
}


