package com.company.epam.introduction_to_java_online.strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public void start(){
        String str2 = "<notes>" +
                "<note id=”1”>" +
                "<to>Вася</to>" +
                "<from>Света</from>" +
                "<heading>Напоминание</heading>" +
                "<body>Позвони мне завтра!</body>" +
                "</note>" +
                "<note id=”2”>" +
                "<to>Петя</to>" +
                "<from>Маша</from>" +
                "<heading>Важное напоминание</heading>" +
                "<body/>" +
                "</note>" +
                "</notes>";

        Pattern pattern = Pattern.compile("<(\\S+)(.*?)>(.*?)<(/\\1)>|<(\\S+)(.*?)/>");
        Matcher m = pattern.matcher(str2);

        while (m.find()) {
            System.out.println("tag: " + m.group(1) + m.group(2) + "..." + m.group(4));
            System.out.println("content: " + m.group(3) + "\n");
            Matcher m2 = pattern.matcher(m.group(3));
            while(m2.find()){
                System.out.println("tag: " + m2.group(1) + m2.group(2) + "..." + m2.group(4));
                System.out.println("content: " + m2.group(3) + "\n");
                Matcher m3 = pattern.matcher(m2.group(3));
                while(m3.find()){
                    System.out.println("tag: " + m3.group(1) + m3.group(2) + "..." + m3.group(4));
                    System.out.println("content: " + m3.group(3) + "\n");
                }
            }
        }
    }
}
