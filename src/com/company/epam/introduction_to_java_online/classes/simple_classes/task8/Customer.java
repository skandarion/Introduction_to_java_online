package com.company.epam.introduction_to_java_online.classes.simple_classes.task8;

public class Customer {
    private int id, creditCardNumber;
    private String surname, name, patronymic,address, bankAccountNumber;

    public Customer(int id, int creditCardNumber, String surname, String name, String patronymic, String address, String bankAccountNumber) {
        this.id = id;
        this.creditCardNumber = creditCardNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.bankAccountNumber = bankAccountNumber;
    }
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return id + ":" + surname + name + patronymic;
    }
}
