package com.company.epam.introduction_to_java_online.tasks_6.task3.server.students;

public class Student {
    private static int ID = 0;
    private int id;
    private String name;
    private String surName;

    public Student(String name, String surName) {
        ID++;
        this.id = ID;
        this.name = name;
        this.surName = surName;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", surName: " + surName;
    }
}
