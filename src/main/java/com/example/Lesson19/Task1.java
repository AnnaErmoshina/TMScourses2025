package com.example.Lesson19;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static class Result {
        Integer min = null;
        Integer max = null;
    }

    static class MaxFinder extends Thread {
        private final int[] array;
        private final Result result;

        public MaxFinder(int[] array, Result result) {
            this.array = array;
            this.result = result;
        }

        @Override
        public void run() {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            synchronized (result) {
                result.max = max;
            }
            System.out.println("Поток поиска максимума завершил работу. Максимум: " + max);
        }
    }

    static class MinFinder extends Thread {
        private final int[] array;
        private final Result result;

        public MinFinder(int[] array, Result result) {
            this.array = array;
            this.result = result;
        }

        @Override
        public void run() {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            synchronized (result) {
                result.min = min;
            }
            System.out.println("Поток поиска минимума завершил работу. Минимум: " + min);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Введенный массив: " + Arrays.toString(array));

        Result result = new Result();

        MaxFinder maxThread = new MaxFinder(array, result);
        MinFinder minThread = new MinFinder(array, result);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();

            System.out.println("\nРезультаты:");
            System.out.println("Максимальное значение: " + result.max);
            System.out.println("Минимальное значение: " + result.min);

        } catch (InterruptedException e) {
            System.err.println("Ошибка при ожидании потоков: " + e.getMessage());
        }
        scanner.close();
    }
}
