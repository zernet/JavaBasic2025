package com.gmail.zernetcsgo.hw10;

import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число:");
        int x = scanner.nextInt();

        printSquare(x);

        System.out.print("\n2.Введіть радіус циліндра (double): ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра (double): ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %.6f.%n",
                radius, height, volume);

        System.out.print("\n3. Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введіть елемент %d: ", i);
            array[i] = scanner.nextInt();
        }
        int sum = sumArray(array);
        System.out.printf("Сума всіх елементів масиву дорівнює %d.%n", sum);

        scanner.nextLine();

        System.out.print("\n4. Введіть рядок для розвороту: ");
        String inputString = scanner.nextLine();
        String reversed = reverseString(inputString);
        System.out.printf("Рядок в зворотному порядку: %s%n", reversed);

        System.out.print("\n5. Введіть цілі числа a і b (через пробіл): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long powerResult = power(a, b);
        System.out.printf("Результат %d^%d дорівнює %d.%n", a, b, powerResult);

        scanner.nextLine();

        System.out.print("\n6. Введіть кількість повторень n: ");
        int repeatCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстову стрічку: ");
        String text = scanner.nextLine();
        System.out.println("Результат:");
        printTextMultiple(repeatCount, text);

        scanner.close();
    }

    public static void printSquare(int num) {
        int square = num * num;
        System.out.printf("Квадрат числа %d дорівнює %d.%n", num, square);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static int sumArray(int[] arr) {
        int total = 0;
        for (int val : arr) {
            total += val;
        }
        return total;
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static long power(int a, int b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printTextMultiple(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
