package com.company.epam.introduction_to_java_online.tasks.task1.menu;

import com.company.epam.introduction_to_java_online.tasks.task1.SideUtils;
import com.company.epam.introduction_to_java_online.tasks.task1.UserUtil;
import com.company.epam.introduction_to_java_online.tasks.task1.entity.User;

import javax.print.attribute.standard.Sides;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class LogIn {
    public static void logging() {
        UserUtil uu = new UserUtil();
        System.out.println("Hello!\n");
        boolean isLogged = false;

        while(!isLogged){
            System.out.println("enter your login: ");
            String login = SideUtils.readString();
            System.out.println("enter your password: ");
            String password = SideUtils.readString();

            for(User u : uu.usersList){
                if(login.equals(u.getLogin()) && SideUtils.toHashMD5(password).equals(u.getPass())){
                    System.out.println("hello, " + u.getFirstName() + " " + u.getLastName());
                    if(u.isAdmin()){
                        isLogged = true;
                        AdminMenu.mainMenu();
                        break;
                    }
                    else {
                        isLogged = true;
                        UserMenu.mainMenu();
                        break;
                    }
                }
            }
            if(!isLogged) {
                System.out.println("wrong username or password. try again");
            }
        }
    }
}
