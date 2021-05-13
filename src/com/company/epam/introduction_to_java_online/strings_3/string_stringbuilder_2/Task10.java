package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.

public class Task10 {
    public static void main(String[] args) {
        System.out.println(getResult("sdasd. safas s asf! dasg adg as?"));
    }
    public static int getResult(String str){
        int count = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?'){
                count++;
            }
        }
        return count;
    }
}
