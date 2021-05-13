package com.company.epam.introduction_to_java_online.strings.first_part;
import java.util.Arrays;

public class Task1 {
    public void getResult(){
        String[] stringArray = {"firstVariable", "secondVariable", "thirdVariable"};
        String[] stringArray2 = new String[stringArray.length];
        for(int i = 0; i < stringArray.length; i ++){
            stringArray2[i] = fromTo(stringArray[i]);
        }
        System.out.println(Arrays.toString(stringArray2));
    }
    public String fromTo(String str){
        char[] chr = str.toCharArray();
        char[] chr2 = new char[str.length() + 1];
        int index = 0;
        for(int i = 0; i < chr.length; i ++){
            if(Character.isUpperCase(chr[i])){
                index = i;
                break;
            }
            chr2[i] = chr[i];
        }
        for (int i = index; i < chr.length; i ++){
            chr2[i+1] = Character.toLowerCase(chr[i]);
        }
        chr2[index] = '_';
        String result = new String(chr2);
        return result;
    }
}
