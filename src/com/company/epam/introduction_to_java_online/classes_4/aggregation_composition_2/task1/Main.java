package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task1;

//Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main {
    public static void main(String[] args) {
        Word w1 = new Word("word1");
        Word w2 = new Word("word2");
        Word w3 = new Word("word3");
        Sentence sentence1 = new Sentence(w1,w2,w3);

        Word w4 = new Word("word4");
        Word w5 = new Word("word5");
        Word w6 = new Word("word6");
        Sentence sentence2 = new Sentence(w4,w5,w6);

        Text text = new Text("first text",sentence1,sentence2);
        text.printText();

        Word w7 = new Word("word7");
        Word w8 = new Word("word8");
        Sentence sentence3 = new Sentence(w7,w8);
        text.add(sentence3);
        text.printText();

        Word w9 = new Word("word9");
        text.add(w9);
        text.printText();
    }
}
