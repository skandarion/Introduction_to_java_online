package com.company.epam.introduction_to_java_online.basic_oop_5.task1;


public abstract class File {
    private String fileName;
    Directory dir;

    public File(String fileName) {
        this.fileName = fileName;
        dir = new Directory();
    }

    public File() {
    }

    public String getFileName() {
        return fileName;
    }

    public abstract void create();

    public void delete(File file){
        file = null;
    }
    public void rename(String newName){
        fileName = newName;
    }
}
