package com.gmail.zernetcsgo.hw9;

import java.util.Random;

public class MagicSquareMatrix {
    public static void main(String[] args) {
        final int N = 4;
        int[][] matrix = new int[N][N];
        Random rnd = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = rnd.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця 4×4:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int sumEvenRows = 0;
        int sumOddRows  = 0;
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
            }
            if (i % 2 == 0) {
                sumEvenRows += rowSum;
            } else {
                sumOddRows += rowSum;
            }
        }

        long prodEvenCols = 1;
        long prodOddCols  = 1;
        for (int j = 0; j < N; j++) {
            long colProd = 1;
            for (int i = 0; i < N; i++) {
                colProd *= matrix[i][j];
            }
            if (j % 2 == 0) {
                prodEvenCols *= colProd;
            } else {
                prodOddCols *= colProd;
            }
        }

        System.out.printf("Сума елементів у парних рядах (рядки 0,2): %d%n", sumEvenRows);
        System.out.printf("Сума елементів у непарних рядах (рядки 1,3): %d%n", sumOddRows);
        System.out.printf("Добуток елементів у парних стовпцях (стовпці 0,2): %d%n", prodEvenCols);
        System.out.printf("Добуток елементів у непарних стовпцях (стовпці 1,3): %d%n", prodOddCols);

        boolean isMagic = true;

        int magicSum = 0;
        for (int j = 0; j < N; j++) {
            magicSum += matrix[0][j];
        }

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        if (isMagic) {
            for (int j = 0; j < N; j++) {
                int colSum = 0;
                for (int i = 0; i < N; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != magicSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        if (isMagic) {
            int diag1 = 0, diag2 = 0;
            for (int i = 0; i < N; i++) {
                diag1 += matrix[i][i];
                diag2 += matrix[i][N - 1 - i];
            }
            if (diag1 != magicSum || diag2 != magicSum) {
                isMagic = false;
            }
        }

        System.out.println();
        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}