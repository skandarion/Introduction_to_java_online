package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult(){
        String result = enterString();
        System.out.println(result);
        System.out.println(removeSameCharsAndSpaces(result));

    }

    public static String removeSameCharsAndSpaces(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length();i++){
            if(stringBuilder.charAt(i)==' '){
                stringBuilder.deleteCharAt(i);
            }
        }

        for (int i = 0; i < stringBuilder.length();i++){
            for (int j = i+1; j < stringBuilder.length();j++){
                if(stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }

        return stringBuilder.toString();
    }

    public static String enterString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
