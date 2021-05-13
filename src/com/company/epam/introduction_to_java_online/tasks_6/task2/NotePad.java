package com.company.epam.introduction_to_java_online.tasks_6.task2;

import com.company.epam.introduction_to_java_online.tasks_6.task2.comps.CompByEmail;
import com.company.epam.introduction_to_java_online.tasks_6.task2.comps.CompByMessage;
import com.company.epam.introduction_to_java_online.tasks_6.task2.comps.CompByTopic;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotePad {
    ArrayList<Note> notes = new ArrayList<>();

    {
        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<ArrayList<Note>>() {
        }.getType();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task2\\notes.txt"));
            notes = gson.fromJson(br, type);
        } catch (FileNotFoundException e) {
            System.out.println("can't find file with the library");
        }
    }

    public void findNotesByTopic(String str) {
        ArrayList<Note> tempList = new ArrayList<>();
        for (Note n : notes) {
            if (isMatchString(str, n.getTopic())) {
                tempList.add(n);
            }
        }
        tempList.forEach(System.out::println);
        System.out.println("do you want to sort notes? (Y / N)");
        String temp = SideUtils.readString();
        if(temp.equalsIgnoreCase("y")){
            sorting(tempList);
        }
    }

    public void findNotesByDate(Date date) {
        ArrayList<Note> tempList = new ArrayList<>();
        for (Note n : notes) {
            if (date.equals(n.getDate())) {
                tempList.add(n);
            }
        }
        tempList.forEach(System.out::println);
        System.out.println("do you want to sort notes? (Y / N)");
    }

    public void findNotesByEmail(String str) {
        ArrayList<Note> tempList = new ArrayList<>();
        for (Note n : notes) {
            if (isMatchString(str, n.geteMail())) {
                tempList.add(n);
            }
        }
        tempList.forEach(System.out::println);
        System.out.println("do you want to sort notes? (Y / N)");
        String temp = SideUtils.readString();
        if(temp.equalsIgnoreCase("y")){
            sorting(tempList);
        }
    }

    public void findNotesByMessage(String str) {
        ArrayList<Note> tempList = new ArrayList<>();
        for (Note n : notes) {
            if (isMatchString(str, n.getMassage())) {
                tempList.add(n);
            }
        }
        tempList.forEach(System.out::println);
        System.out.println("do you want to sort notes? (Y / N)");
        String temp = SideUtils.readString();
        if(temp.equalsIgnoreCase("y")){
            sorting(tempList);
        }
    }

    public void createNote() {
        Note note;
        System.out.println("enter topic");
        String s1 = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
        System.out.println("enter email");
        String s2 = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
        System.out.println("enter message");
        String s3 = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
        note = new Note(s1, s2, s3);
        System.out.println("note was successfully created");
    }

    public void resetFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(notes);
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task2\\notes.txt");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("cant find file of library");
        }
    }

    public boolean isMatchString(String str, String text) {
        Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    private void sorting(ArrayList<Note> list) {
        System.out.println("1. sort by topic\n" +
                "2. sort by date\n" +
                "3. sort by email\n" +
                "4. sort by message\n");
        int choice = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readInt();
        switch (choice) {
            case 1: {
                CompByTopic cbt = new CompByTopic();
                Collections.sort(list, cbt);
                list.forEach(System.out::println);
                break;
            }
            case 2: {
                Collections.sort(list);
                list.forEach(System.out::println);
                break;
            }
            case 3: {
                CompByEmail cbe = new CompByEmail();
                Collections.sort(list,cbe);
                list.forEach(System.out::println);
                break;
            }
            case 4: {
                CompByMessage cbm = new CompByMessage();
                Collections.sort(list,cbm);
                list.forEach(System.out::println);
                break;
            }
        }
    }
}
