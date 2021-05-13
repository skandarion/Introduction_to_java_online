package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task9;

public class Book {
    private static int idCount = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int publishingYear;
    private int numbrOfPages;
    private int cost;
    private String bindingType;

    public Book(String name, String author, String publisher, int publishingYear, int numbrOfPages, int cost, String bindingType) {
        this.id = idCount++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.numbrOfPages = numbrOfPages;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public Book(String author) {
        this.author = author;
        this.id = idCount++;
    }

    public Book() {
        this.id = idCount++;
    }


    @Override
    public String toString() {
        return "id=" + id +
                " " + name + " " + author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNumbrOfPages() {
        return numbrOfPages;
    }

    public void setNumbrOfPages(int numbrOfPages) {
        this.numbrOfPages = numbrOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}
