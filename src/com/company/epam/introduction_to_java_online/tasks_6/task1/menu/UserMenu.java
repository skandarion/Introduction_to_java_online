package com.company.epam.introduction_to_java_online.tasks_6.task1.menu;

import com.company.epam.introduction_to_java_online.tasks_6.task1.Library;
import com.company.epam.introduction_to_java_online.tasks_6.task1.SideUtils;


public class UserMenu {
    public static void mainMenu(){
        System.out.println("1. view book library\n" +
                "2. search book in library\n" +
                "3. relogin\n" +
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
}
