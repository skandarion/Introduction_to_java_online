package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task1;

import java.util.ArrayList;

public class Text {
    private String header;

    ArrayList<Sentence> arraySentence = new ArrayList<Sentence>();

    public Text(String header,Sentence... arraySentence) {
        for (Sentence s : arraySentence) {
            this.arraySentence.add(s);
        }
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public void printText(){
        System.out.println(header);
        for(Sentence s : arraySentence){
            s.print();
            System.out.print(". ");
        }
        System.out.println("");
    }
    public void add(Sentence s){
        arraySentence.add(s);
    }
    public void add(Word w){
        Sentence sentence = new Sentence(w);
        arraySentence.add(sentence);
    }
}
