package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task4;

import java.util.Collection;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        Account a1 = new Account(-1000);
        Account a2 = new Account(3000);
        Account a3 = new Account(-2000);
        Account a4 = new Account(4000);
        Client c1 = new Client("Tomphson");
        c1.addAccount(a1,a2,a3,a4);
        c1.printInfo();
        for(Account a : c1.accountsList){
            if(a.getBalance() < 0){
                a.blockAccount();
            }
        }
        c1.printInfo();
        System.out.println(c1.sumOfBalances());
        System.out.println(c1.sumOfPositiveBalances());
        System.out.println(c1.sumOfNegativeBalances());
        Collections.sort(c1.accountsList);
        c1.printInfo();
        c1.printBlockedAccounts();
    }
}
