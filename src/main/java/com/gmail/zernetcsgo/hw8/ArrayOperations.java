package com.gmail.zernetcsgo.hw8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        final int SIZE = 15;
        int[] numbers = new int[SIZE];

        Random rnd = new Random();

        for (int i = 0; i < SIZE; i++) {
            numbers[i] = rnd.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("Відсортований масив:       " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int key = scanner.nextInt();
        scanner.close();

        int index = binarySearch(numbers, key);

        if (index >= 0) {
            System.out.printf("Індекс числа %d у відсортованому масиві: %d%n", key, index);
        } else {
            System.out.printf("Число %d не знайдено у масиві.%n", key);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
