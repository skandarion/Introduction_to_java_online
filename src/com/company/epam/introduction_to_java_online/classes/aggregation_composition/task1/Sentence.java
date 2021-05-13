package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task1;


import java.util.ArrayList;

public class Sentence {
    ArrayList<Word> arrayWord = new ArrayList<Word>();

    public Sentence(Word ... arrayWord){
        for(Word w : arrayWord){
            this.arrayWord.add(w);
        }
    }
    public void print(){
        for(Word w : arrayWord){
            w.print();
        }
    }
}
