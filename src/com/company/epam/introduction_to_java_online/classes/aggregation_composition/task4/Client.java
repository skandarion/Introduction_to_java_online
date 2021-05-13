package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task4;

import java.util.ArrayList;

public class Client {
    private String clientName;
    ArrayList<Account> accountsList;

    public Client(String clientName) {
        this.clientName = clientName;
        accountsList = new ArrayList<Account>();
    }
    public void addAccount(Account ... account){
        for(Account a : account){
            accountsList.add(a);
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void printInfo(){
        System.out.println("Client name: " + clientName);
        for(Account a: accountsList){
            System.out.println(a.toString());
        }
    }
    public int sumOfBalances(){
        int sum = 0;
        for(Account a : accountsList){
            sum = sum + a.getBalance();
        }
        return sum;
    }
    public int sumOfPositiveBalances(){
        int sum = 0;
        for(Account a : accountsList){
            if(a.getBalance() > 0) {
                sum = sum + a.getBalance();
            }
        }
        return sum;
    }
    public int sumOfNegativeBalances(){
        int sum = 0;
        for(Account a : accountsList){
            if(a.getBalance() < 0) {
                sum = sum + a.getBalance();
            }
        }
        return sum;
    }
    public void printBlockedAccounts(){
        System.out.println("Client name: " + clientName);
        for(Account a : accountsList){
            if(a.isBloked()){
                System.out.println(a.toString());
            }
        }
    }
}
