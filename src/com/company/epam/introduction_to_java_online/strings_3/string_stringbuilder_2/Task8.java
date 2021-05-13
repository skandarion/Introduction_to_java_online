package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        System.out.println(findLongestWord(enterString()));
    }

    public static String findLongestWord(String str){
        int count = 0;
        int index = 0;
        int tempcount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                tempcount++;
            }
            else {
                if(tempcount > count){
                    count = tempcount;
                    index = i;
                }
                tempcount = 0;
            }
        }
        String result = str.substring(index-count,index);
        return result;
    }

    public static String enterString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
