package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

import java.util.Scanner;

public class Task7 {
    public void getResult(){
        String result = enterString();
        System.out.println(result);
        System.out.println(removeSameCharsAndSpaces(result));

    }

    public String removeSameCharsAndSpaces(String str){
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

    public String enterString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
