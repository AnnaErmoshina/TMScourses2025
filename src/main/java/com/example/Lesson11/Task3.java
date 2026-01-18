package com.example.Lesson11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int totalLength = 0;

        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
            totalLength += strings[i].length();
        }

        double averageLength = totalLength / 3.0;
        System.out.printf("\nСредняя длина строк: " + averageLength);

        System.out.println("\nСтроки короче средней длины:");
        boolean found = false;

        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println("\"" + str + "\" (длина: " + str.length() + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Таких строк нет.");
        }
    }
}
