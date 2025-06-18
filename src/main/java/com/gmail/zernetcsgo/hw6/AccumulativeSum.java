package com.gmail.zernetcsgo.hw6;

import java.util.Scanner;

public class AccumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers to sum: ");
        int n = scanner.nextInt();

        System.out.println("\n--- for loop ---");
        printWithFor(n);

        System.out.println("\n--- while loop ---");
        printWithWhile(n);

        System.out.println("\n--- do‑while loop ---");
        printWithDoWhile(n);
}
    public static void printWithFor(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, sum);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void printWithWhile(int count) {
        int i = 1;
        int sum = 0;
        while (i <= count) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, sum);
            i++;
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void printWithDoWhile(int count) {
        int i = 1;
        int sum = 0;
        if (count > 0) {
            do {
                sum += i;
                System.out.printf("%d) Num is %d, sum is %d%n", i, i, sum);
                i++;
            } while (i <= count);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
