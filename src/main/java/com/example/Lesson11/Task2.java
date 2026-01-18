package com.example.Lesson11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    // Меняем местами
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        System.out.println("\nСтроки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println("\"" + str + "\" (длина: " + str.length() + ")");
        }
    }
}
