package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task4;

public class Account implements Comparable<Account>{
    private static int ID = 1;
    private int balance = 0;
    private int accountNumber;
    private boolean isBloked = false;

    public Account(int balance) {
        this.balance = balance;
        accountNumber = ID++;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(isBloked){
            System.out.println("sorry, this account is blocked.");
        }
        else this.balance = balance;
    }
    public void blockAccount(){
        isBloked = true;
    }
    public void unblockAccount(){
        isBloked = false;
    }

    public boolean isBloked() {
        return isBloked;
    }

    @Override
    public String toString() {
        if(isBloked){
            return "Account number: " + accountNumber + " balance: " + balance + " (account is blocked)";
        }
        else return "Account number: " + accountNumber + " balance: " + balance;
    }

    @Override
    public int compareTo(Account o){
        if (this.balance == o.balance){
            return 0;
        }
        else if (this.balance < o.balance){
            return -1;
        }
        else
            return 1;
        }
}

