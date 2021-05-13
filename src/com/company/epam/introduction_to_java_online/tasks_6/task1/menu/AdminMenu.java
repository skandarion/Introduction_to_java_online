package com.company.epam.introduction_to_java_online.tasks_6.task1.menu;

import com.company.epam.introduction_to_java_online.tasks_6.task1.Library;
import com.company.epam.introduction_to_java_online.tasks_6.task1.SideUtils;

public class AdminMenu {
    public static void mainMenu(){
        System.out.println("1. view book library\n" +
                "2. search book in library\n" +
                "3. edit library\n" +
                "4. relogin\n" +
                "0. exit program");
        int choice = SideUtils.readInt();


        switch (choice){
            case 1: {
                Library.showLibrary();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                mainMenu();
                break;
            }
            case 2:{
                searchMenu();
                break;
            }
            case 3:{
                editMenu();
                break;
            }case 4:{
                LogIn.logging();
                break;
            }
            case 0:{
                System.out.println("bye bye!");
                break;
            }
        }
    }
    public static void searchMenu(){
        System.out.println("1. search by book name\n" +
                "2. search by author\n" +
                "3. search by book format\n" +
                "0. back");

        int choice = SideUtils.readInt();
        switch (choice){
            case 1: {
                Library.searchBook();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                searchMenu();
                break;
            }
            case 2:{
                Library.searchByAuthor();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                searchMenu();
                break;
            }
            case 3:{
                Library.searchByFormat();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                searchMenu();
                break;
            }
            case 0:{
                mainMenu();
                break;
            }
        }
    }
    public static void editMenu(){
        System.out.println("1. remove book \n" +
                "2. remove all the author's books \n" +
                "3. remove books by type\n" +
                "0. back\n");

        int choice = SideUtils.readInt();
        switch (choice){
            case 1: {
                Library.removeBook();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                editMenu();
                break;
            }
            case 2:{
                Library.removeBooksByAuthor();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                editMenu();
                break;
            }
            case 3:{
                Library.removeBooksByType();
                System.out.println("enter to return to previous menu");
                SideUtils.readString();
                editMenu();
                break;
            }
            case 0:{
                mainMenu();
                break;
            }
        }
    }
}
