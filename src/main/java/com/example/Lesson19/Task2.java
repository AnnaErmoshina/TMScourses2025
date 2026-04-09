package com.example.Lesson19;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    static class InsertionSortThread extends Thread {
        private final int[] originalArray;
        private int[] sortedArray;

        public InsertionSortThread(int[] array) {
            this.originalArray = Arrays.copyOf(array, array.length);
        }

        @Override
        public void run() {
            sortedArray = Arrays.copyOf(originalArray, originalArray.length);

            for (int i = 1; i < sortedArray.length; i++) {
                int key = sortedArray[i];
                int j = i - 1;

                while (j >= 0 && sortedArray[j] > key) {
                    sortedArray[j + 1] = sortedArray[j];
                    j--;
                }
                sortedArray[j + 1] = key;
            }
        }

        public int[] getSortedArray() {
            return sortedArray;
        }
    }

    static class SelectionSortThread extends Thread {
        private final int[] originalArray;
        private int[] sortedArray;

        public SelectionSortThread(int[] array) {
            this.originalArray = Arrays.copyOf(array, array.length);
        }

        @Override
        public void run() {
            sortedArray = Arrays.copyOf(originalArray, originalArray.length);

            for (int i = 0; i < sortedArray.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < sortedArray.length; j++) {
                    if (sortedArray[j] < sortedArray[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = sortedArray[minIndex];
                sortedArray[minIndex] = sortedArray[i];
                sortedArray[i] = temp;
            }
        }

        public int[] getSortedArray() {
            return sortedArray;
        }
    }

    static class BubbleSortThread extends Thread {
        private final int[] originalArray;
        private int[] sortedArray;

        public BubbleSortThread(int[] array) {
            this.originalArray = Arrays.copyOf(array, array.length);
        }

        @Override
        public void run() {
            sortedArray = Arrays.copyOf(originalArray, originalArray.length);

            for (int i = 0; i < sortedArray.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                    if (sortedArray[j] > sortedArray[j + 1]) {
                        int temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }

        public int[] getSortedArray() {
            return sortedArray;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Многопоточная сортировка массива");

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(array));

        InsertionSortThread insertionThread = new InsertionSortThread(array);
        SelectionSortThread selectionThread = new SelectionSortThread(array);
        BubbleSortThread bubbleThread = new BubbleSortThread(array);

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        try {
            insertionThread.join();
            selectionThread.join();
            bubbleThread.join();
        } catch (InterruptedException e) {
            System.err.println("Ошибка при ожидании потоков: " + e.getMessage());
        }

        System.out.println("\nРезультаты сортировки:");

        System.out.println("Сортировка вставками:");
        System.out.println(Arrays.toString(insertionThread.getSortedArray()));

        System.out.println("\nСортировка выбором:");
        System.out.println(Arrays.toString(selectionThread.getSortedArray()));

        System.out.println("\nСортировка пузырьком:");
        System.out.println(Arrays.toString(bubbleThread.getSortedArray()));

        scanner.close();
    }
}
