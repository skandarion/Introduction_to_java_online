package com.company.epam.introduction_to_java_online.tasks.task1.entity;

import com.company.epam.introduction_to_java_online.tasks.task1.SideUtils;

import java.security.NoSuchAlgorithmException;

public class User {
    private final String FirstName;
    private final String LastName;
    private final String login;
    private final String pass;
    private final boolean isAdmin;

    public User(String firstName, String lastName, String login, String pass, boolean isAdmin) throws NoSuchAlgorithmException {
        FirstName = firstName;
        LastName = lastName;
        this.login = login;
        this.pass = SideUtils.toHashMD5(pass);
        this.isAdmin = isAdmin;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "FirstName: " + FirstName + ", LastName: " + LastName + ", login: " + login + ", pass: " + pass + ", isAdmin=" + isAdmin;
    }

}
