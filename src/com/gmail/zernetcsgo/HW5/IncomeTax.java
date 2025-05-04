package com.gmail.zernetcsgo.HW5;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть суму доходу (грн): ");

        double income = scanner.nextDouble();

        if (income < 0) {
            System.out.println("Доход не може бути від’ємним.");
            return;
        }

        double rate;

        if (income <= 10_000) {
            rate = 0.025;
        } else if (income <= 25_000) {
            rate = 0.043;
        } else {
            rate = 0.067;
        }

        double tax = income * rate;

        System.out.printf("Ставка: %.2f %% %n", rate * 100);
        System.out.printf("Сума податку: %.2f грн%n", tax);
    }
}
