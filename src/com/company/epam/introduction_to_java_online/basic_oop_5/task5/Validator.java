package com.company.epam.introduction_to_java_online.basic_oop_5.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static boolean checkWithRegEx(String str){
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static boolean isValidFlowers(String str){
        if(checkWithRegEx(str)){
            if(str.equalsIgnoreCase("rose") || str.equalsIgnoreCase("begonia") ||
                    str.equalsIgnoreCase("tulip")) {
                return true;
            }
            else System.out.println("no flowers");
                 return false;
        }
        else System.out.println("incorrect");
            return false;
    }
    public static boolean isValidPackaging(String str){
        if(checkWithRegEx(str)){
            if(str.equalsIgnoreCase("film") || str.equalsIgnoreCase("organza")) {
                return true;
            }
            else System.out.println("no packaging");
            return false;
        }
        else System.out.println("incorrect");
        return false;
    }
}
