package com.company.epam.introduction_to_java_online.basic_oop.task2;

public class Task2 {
    public static void main(String[] args) {
        Payment p = new Payment("paymentName");
        p.addProductToList("p1", 100);
        p.addProductToList("p2", 500);
        p.addProductToList("p3", 300);
        p.showList();

        Payment.Product p4 = p.new Product("p4", 700);
        p.addProductToList(p4);
        p.showList();
    }
}
