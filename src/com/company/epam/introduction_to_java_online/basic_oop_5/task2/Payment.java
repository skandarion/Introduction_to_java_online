package com.company.epam.introduction_to_java_online.basic_oop_5.task2;

import java.util.ArrayList;

public class Payment {
    private String paymentName;
    private int totalCost;
    ArrayList<Product> productList;

    public Payment(String paymentName) {
        this.paymentName = paymentName;
        productList = new ArrayList<Product>();
    }

    public void addProductToList (String name, double cost){
        productList.add(new Product(name,cost));
    }
    public void addProductToList (Product p){
        productList.add(p);
    }
    public void showList(){
        productList.forEach(System.out::println);
    }

    public class Product{
        private String productName;
        private double cost;

        public Product(String productName, double cost) {
            this.productName = productName;
            this.cost = cost;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "productName: " + productName + ", cost: " + cost;
        }
    }
}
