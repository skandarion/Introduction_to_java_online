package com.company.epam.introduction_to_java_online.basic_oop_5.task2;

//Создать класс Payment с внутренним классом,
// с помощью объектов которого можно сформировать покупку из нескольких товаров.

public class Main {
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
