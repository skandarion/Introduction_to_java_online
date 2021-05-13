package com.company.epam.introduction_to_java_online.tasks_6.task2;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    NotePad notePad = new NotePad();

    public void mainMenu() throws IOException {
        while(true) {
            System.out.println( "1. find notes\n" +
                                "2. create new note\n" +
                                "0. save and exit");
            int choice = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readInt();


            switch (choice) {
                case 1: {
                    findMenu();
                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }

                case 2: {
                    notePad.createNote();
                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }

            }
            if(choice == 0){
                notePad.resetFile();
                System.out.println("bye bye");
                break;
            }
        }
    }
    public void findMenu() throws IOException {
        while(true) {
            System.out.println( "1. find by topic\n" +
                    "2. find by date\n" +
                    "3. find by email\n" +
                    "4. find by message\n" +
                    "0. back");
            int choice = com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readInt();


            switch (choice) {
                case 1: {
                    System.out.println("enter topic for searching");
                    String userRequest = SideUtils.readString();
                    notePad.findNotesByTopic(userRequest);
                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }
                case 2: {
                    System.out.println("enter date for searching (dd/MM/yyyy)");
                    String userRequest = SideUtils.readString();
                    if(isValidDate(userRequest)){
                        try {
                            Date date= format.parse(userRequest);
                            notePad.findNotesByDate(date);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }
                case 3: {
                    System.out.println("enter email for searching");
                    String userRequest = SideUtils.readString();
                    notePad.findNotesByEmail(userRequest);
                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }
                case 4: {
                    System.out.println("enter message for searching");
                    String userRequest = SideUtils.readString();
                    notePad.findNotesByMessage(userRequest);
                    System.out.println("enter to return to previous menu");
                    com.company.epam.introduction_to_java_online.tasks_6.task2.SideUtils.readString();
                    break;
                }

            }
            if(choice == 0){
                mainMenu();
                break;
            }
        }
    }

    boolean isValidDate(String input) {
        try {
            format.parse(input);
            return true;
        }
        catch(ParseException e){
            return false;
        }
    }
}
