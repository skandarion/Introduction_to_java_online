package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;



public class Task9 {
    public void getResult(){
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
