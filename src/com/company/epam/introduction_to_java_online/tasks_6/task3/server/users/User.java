package com.company.epam.introduction_to_java_online.tasks_6.task3.server.users;

import com.company.epam.introduction_to_java_online.tasks_6.task3.server.SideUtils;


public class User {
    private  String FirstName;
    private  String LastName;
    private  String login;
    private  String pass;
    private  boolean isAdmin;

    public User(String firstName, String lastName, String login, String pass, boolean isAdmin){
        FirstName = firstName;
        LastName = lastName;
        this.login = login;
        this.pass = SideUtils.toHashMD5(pass);
        this.isAdmin = isAdmin;
    }

    public User() {
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

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "FirstName: " + FirstName + ", LastName: " + LastName + ", login: " + login + ", pass: " + pass + ", isAdmin=" + isAdmin;
    }
}
