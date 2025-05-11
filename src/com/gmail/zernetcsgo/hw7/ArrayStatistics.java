package com.gmail.zernetcsgo.hw7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size (>= 0): ");


        int size = scanner.nextInt();
        int[] numbers = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rnd.nextInt(201) - 100;
        }
        System.out.println("Array elements: " + Arrays.toString(numbers));


        int negativeSum = 0;
        for (int value : numbers) {
            if (value < 0) {
                negativeSum += value;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeSum);


        int evenCount = 0;
        for (int value : numbers) {
            if (value % 2 == 0) {
                evenCount++;
            }
        }
        int oddCount = size - evenCount;
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers:  " + oddCount);


        if (size > 0) {
            int minIdx = 0;
            int maxIdx = 0;
            for (int i = 1; i < size; i++) {
                if (numbers[i] < numbers[minIdx]) {
                    minIdx = i;
                }
                if (numbers[i] > numbers[maxIdx]) {
                    maxIdx = i;
                }
            }
            System.out.printf("Smallest element: %d (index %d)%n", numbers[minIdx], minIdx);
            System.out.printf("Largest element:  %d (index %d)%n", numbers[maxIdx], maxIdx);
        }


        int firstNegIdx = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] < 0) {
                firstNegIdx = i;
                break;
            }
        }

        if (firstNegIdx == -1) {
            System.out.println("There are no negative numbers in the array.");
        } else if (firstNegIdx == size - 1) {
            System.out.println("No elements after the first negative number.");
        } else {
            int tailSum = 0;
            for (int i = firstNegIdx + 1; i < size; i++) {
                tailSum += numbers[i];
            }
            double average = tailSum / (double) (size - firstNegIdx - 1);
            System.out.printf("Average after first negative number: %.2f%n", average);
        }
    }
}