package com.gmail.zernetcsgo.hw3;

public class Shop {
    public static void main(String[] args) {
        printOrder(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        printOrder(2, "Tom", "laptop", 570.95, "Terra Street, 17");
    }

    public static void printOrder(int orderNumber, String client, String product, double price, String address) {
        System.out.println("Shop-online for customers");
        System.out.println("Order No " + orderNumber + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("Price EUR " + price + ".");
        System.out.println("Address: " + address + ".");
    }
}