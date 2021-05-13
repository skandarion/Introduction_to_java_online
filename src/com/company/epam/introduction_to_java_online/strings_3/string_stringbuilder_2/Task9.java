package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task9 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        int countUpper = 0;
        int countLower = 0;
        String str = "sad GDds sasFA п фыАА";
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                if(str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z'){
                    countLower++;
                }
            }
            if(Character.isUpperCase(str.charAt(i))){
                if(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z'){
                    countUpper++;
                }
            }

        }
        System.out.println("lower: " + countLower);
        System.out.println("upper: " + countUpper);
    }
}
