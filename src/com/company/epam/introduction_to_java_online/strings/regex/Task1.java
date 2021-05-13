package com.company.epam.introduction_to_java_online.strings.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public void start() throws IOException {
        System.out.println("введите текс, с которым будут выполнять операции.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println("выберете какую операцию совершить с текстом." +
                            "\n1 - отсортировать абзацы по количеству предложений" +
                            "\n2 - отсортировать слова по длинне" +
                            "\n3 - отсортировать слова по количеству вхождений ключа (при равенстве, по алфавиту)" +
                            "\nвведите нужный вариант");
        int choice = Integer.parseInt(reader.readLine());
        switch (choice){
            case 1:
                System.out.println(sortByNumbersOfSentencesInParagraph(str));
                break;
            case 2:
                System.out.println(sortByLengthOfWordsInSentences(str));
                break;
            case 3:
                System.out.println("введите ключ для сортировки:");
                String key = reader.readLine();
                System.out.println(sortByNumberOfKeysInWords(str,key));
                break;
        }

    }

    public String sortByNumbersOfSentencesInParagraph(String str){
        Pattern pattern1 = Pattern.compile("(?=\\s{4})");
        Pattern pattern2 = Pattern.compile("(?<=(\\.|!|\\?))");

        String[] strArray = pattern1.split(str);
        String[][] strDoubleArray = new String[strArray.length][];
        for (int i = 0; i < strArray.length; i++){
            strDoubleArray[i] = pattern2.split(strArray[i]);
        }
        bubbleSort(strDoubleArray);

        String result = "";
        StringBuilder sb = new StringBuilder(result);
        for (int i=0; i<strDoubleArray.length; i++) {
            for (int j=0; j<strDoubleArray[i].length; j++) {
                sb.append(strDoubleArray[i][j]);
            }
        }
        result = sb.toString();
        return result;
    }
    public static void bubbleSort(String[][] strArray) {
        for(int i = 0; i < strArray.length; i++){
            for(int j = 0; j < strArray.length - 1; j++){
                if(strArray[j].length > strArray[j + 1].length){
                    String[] str = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = str;
                }
            }
        }
    }

    public String sortByLengthOfWordsInSentences(String str){
        Pattern pattern = Pattern.compile("(\\.|!|\\?)\\s*");
        Pattern pattern2 = Pattern.compile("\\s");
        String[] strArray = pattern.split(str.toLowerCase().trim());
        Pattern patternTemp = Pattern.compile("(?<=(\\.|!|\\?))");
        String[] strArrayTemp = patternTemp.split(str);
        String[][] strDoubleArray = new String[strArray.length][];
        for (int i = 0; i < strArray.length; i++) {
            strDoubleArray[i] = pattern2.split(strArray[i]);
        }
        //сортировка слов в предложении по длинне
        for(int k = 0; k < strDoubleArray.length; k++) {
            for (int i = 0; i < strDoubleArray[k].length; i++) {
                for (int j = 0; j < strDoubleArray[k].length - 1; j++) {
                    if (strDoubleArray[k][j].length() > strDoubleArray[k][j + 1].length()) {
                        String tempStr = strDoubleArray[k][j];
                        strDoubleArray[k][j] = strDoubleArray[k][j + 1];
                        strDoubleArray[k][j + 1] = tempStr;
                        // в случае одинаковой длинны, по алфавиту
                    } else if (strDoubleArray[k][j].length() == strDoubleArray[k][j + 1].length()) {
                        for (int p = 0; p < strDoubleArray[k][j].length(); p++) {
                            if (strDoubleArray[k][j].charAt(p) > strDoubleArray[k][j + 1].charAt(p)) {
                                String tempStr = strDoubleArray[k][j];
                                strDoubleArray[k][j] = strDoubleArray[k][j + 1];
                                strDoubleArray[k][j + 1] = tempStr;
                                break;
                            } else if (strDoubleArray[k][j].charAt(p) < strDoubleArray[k][j + 1].charAt(p)) {
                                break;
                            }
                        }
                    }

                }
            }
        }
        // заполнение результирующей строки сортированным массивом
        Pattern p = Pattern.compile("\\s{4}");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strDoubleArray.length; i++) {
            strDoubleArray[i][0] = strDoubleArray[i][0].substring(0, 1).toUpperCase() + strDoubleArray[i][0].substring(1);
            Matcher m = p.matcher(strArrayTemp[i]);
            if(m.find()){
                sb.append("    ");
            }
            for (int j=0; j<strDoubleArray[i].length; j++) {
                sb.append(strDoubleArray[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(strArrayTemp[i].charAt(strArrayTemp[i].length()-1)).append(" ");
        }
        String result = sb.toString();
        return result;
    }

    public String sortByNumberOfKeysInWords (String str, String key){
        Pattern pattern1 = Pattern.compile("(\\.|!|\\?)\\s*");
        String[] array = pattern1.split(str.toLowerCase().trim());

        Pattern pattern2 = Pattern.compile("\\s");
        String[][] doubleArray = new String[array.length][];
        for(int i = 0; i < array.length; i++) {
            doubleArray[i] = pattern2.split(array[i]);
        }
        // создание нового массива int с количеством вхождений ключа в каждом слове
        // сортировка этого массива и параллельная сортировка исходного массива со String
        for(int i = 0; i < array.length; i++){
            int[] intArray = new int[doubleArray[i].length];
            for(int j = 0; j < doubleArray[i].length; j++){
                intArray[j] = countOfKeysInWord(doubleArray[i][j], key);
            }
            // сортировка массива int
            for(int k = 0; k < doubleArray[i].length; k++){
                for(int p = 0; p < doubleArray[i].length - 1; p++){
                    if(intArray[p] < intArray[p+1]){
                        int intTemp = intArray[p];
                        intArray[p] = intArray[p + 1];
                        intArray[p + 1] = intTemp;
                        // параллельная сортировка массива String
                        String tempStr = doubleArray[i][p];
                        doubleArray[i][p] = doubleArray[i][p + 1];
                        doubleArray[i][p + 1] = tempStr;
                    }
                    // если количество вхождений ключа в словах равны
                    // идет сортировка по алфавиту
                    else if (intArray[p] == intArray[p+1]){
                        for (int a = 0; a < doubleArray[i][p].length(); a++){
                            if (doubleArray[i][p].charAt(a) > doubleArray[i][p + 1].charAt(a)) {
                                int intTemp = intArray[p];
                                intArray[p] = intArray[p + 1];
                                intArray[p + 1] = intTemp;

                                String tempStr = doubleArray[i][p];
                                doubleArray[i][p] = doubleArray[i][p + 1];
                                doubleArray[i][p + 1] = tempStr;
                                break;
                            } else if (doubleArray[i][p].charAt(a) < doubleArray[i][p + 1].charAt(a)) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(doubleArray[i]));
        }

        Pattern patternTemp = Pattern.compile("(?<=(\\.|!|\\?))");
        String[] strArrayTemp = patternTemp.split(str);
        Pattern p = Pattern.compile("\\s{4}");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<doubleArray.length; i++) {
            doubleArray[i][0] = doubleArray[i][0].substring(0, 1).toUpperCase() + doubleArray[i][0].substring(1);
            Matcher m = p.matcher(strArrayTemp[i]);
            if(m.find()){
                sb.append("    ");
            }
            for (int j=0; j<doubleArray[i].length; j++) {
                sb.append(doubleArray[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(strArrayTemp[i].charAt(strArrayTemp[i].length()-1)).append(" ");
        }
        String result = sb.toString();
        return result;

    }

    public int countOfKeysInWord(String str, String key){
        Pattern p = Pattern.compile(key);
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find()){
            count++;
        }
        return count;
    }
}
