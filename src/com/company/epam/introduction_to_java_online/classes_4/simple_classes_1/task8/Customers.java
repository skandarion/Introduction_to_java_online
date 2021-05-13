package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task8;

import java.util.Arrays;

public class Customers {
    Customer[] customersArray = new Customer[3];
    public void setArray(){
        customersArray[0] = new Customer(1,10004516, "Ivanov", "Sergey", "Irogevich", "Lenina, 45", "BY14 3014 6373");
        customersArray[1] = new Customer(2,20004516, "Aleksandrov", "Petr", "Semenovich", "Lenina, 66", "BY14 3014 1246");
        customersArray[2] = new Customer(3,10015226, "Aleksandrov", "Igor", "Irogevich", "Lenina, 666", "BY14 3014 8421");
    }

   public void ListSortedByName(){
        ComparatorByName comp = new ComparatorByName();
        Arrays.sort(customersArray, comp);
        System.out.println(Arrays.toString(customersArray));
   }

    public void ListSortedByCard(int from, int to){
        for(int i = 0; i < customersArray.length; i++){
            if(customersArray[i].getCreditCardNumber() >= from && customersArray[i].getCreditCardNumber() <= to){
                System.out.println(customersArray[i].toString());
            }
        }
    }
}
