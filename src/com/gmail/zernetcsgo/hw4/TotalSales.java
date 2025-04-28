package com.gmail.zernetcsgo.hw4;

public class TotalSales {
    public static void main(String[] args) {
        String productName;
        int quantity;
        double price;
        int days;
        double totalSales;
        double averageDailySales;

        String currency = "EUR";
        productName = "smartphone";
        quantity = 37;
        price = 328.45;
        days  = 5;

        totalSales = quantity * price;
        averageDailySales = totalSales / days;

        System.out.printf("Product: %s%n", productName);
        System.out.printf("Total sales for %d days: %s %.2f%n", days, currency, totalSales);
        System.out.printf("Average daily sales: %s %.2f%n%n", currency, averageDailySales);

        productName = "laptop";
        quantity = 19;
        price = 553.00;
        days = 7;

        totalSales = quantity * price;
        averageDailySales = totalSales / days;

        System.out.printf("Product: %s%n", productName);
        System.out.printf("Total sales for %d days: %s %.2f%n", days, currency, totalSales);
        System.out.printf("Average daily sales: %s %.2f%n", currency, averageDailySales);
    }
}